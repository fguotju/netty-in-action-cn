package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;

/**
 * Created by kerr.
 */
public class DummyChannelHandlerContext extends io.netty.channel.AbstractChannelHandlerContext {
    public static io.netty.channel.ChannelHandlerContext DUMMY_INSTANCE = new DummyChannelHandlerContext(
            null,
            null,
            "dummyChannelHandlerContext"
    );
    public DummyChannelHandlerContext(io.netty.channel.DefaultChannelPipeline pipeline,
                                      EventExecutor executor,
                                      String name) {
        super(pipeline, executor, name, io.netty.channel.ChannelDuplexHandler.class);
    }

    @Override
    public io.netty.channel.ChannelHandler handler() {
        return null;
    }
}
