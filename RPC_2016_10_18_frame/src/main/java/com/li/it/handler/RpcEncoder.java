package com.li.it.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import com.li.it.utils.SerializationUtil;

/**
 * RPC编码
 */
public class RpcEncoder extends MessageToByteEncoder {

	private Class<?> genericClass;
	 
    public RpcEncoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }
 
    @Override
    public void encode(ChannelHandlerContext ctx, Object in, ByteBuf out) throws Exception {
        if (genericClass.isInstance(in)) {
            byte[] data = SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }
}
