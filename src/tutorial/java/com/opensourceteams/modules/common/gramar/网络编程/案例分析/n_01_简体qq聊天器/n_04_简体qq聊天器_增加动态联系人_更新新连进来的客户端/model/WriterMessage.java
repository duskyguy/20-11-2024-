package com.opensourceteams.modules.common.gramar.网络编程.案例分析.n_01_简体qq聊天器.n_04_简体qq聊天器_增加动态联系人_更新新连进来的客户端.model;

import com.opensourceteams.modules.common.java.binary.IntConvertEachBinary;

/**
 * 开发者:刘文  Email:372065525@qq.com
 * 16/3/17  下午4:45
 * 功能描述:输出消息
 */

public class WriterMessage extends Message{


    public WriterMessage(String text){
        super.setType((byte) 1);
        super.setContent(text.getBytes());
        super.setLength(text.getBytes().length);
    }

    public WriterMessage(byte[] text){
        super.setType((byte) 1);
        super.setContent(text);
        super.setLength(text.length);
    }





    /**
     * 生成报文
     * 第一个byte 是文件类型 1:文本
     * 第二个byte到第五个byte,共4个byte表示文件的长度
     * 第三个部分,是文件的数据
     * @return
     */
    public  byte[] genMessagePack(){
        byte[] dataArray = new byte[ 1 + 4 + getLength()];

        byte[] lengtyArray = IntConvertEachBinary.convertIntToByteArry(super.getLength());

        dataArray[0] = 1 ;

        System.arraycopy(lengtyArray,0,dataArray,1,4);
        System.arraycopy(super.getLength(),0,dataArray,5,super.getLength());

        return dataArray;
    }
}
