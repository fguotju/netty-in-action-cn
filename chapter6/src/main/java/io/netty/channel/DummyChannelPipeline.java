package io.netty.channel;

/**
 * Created by kerr.
 */
public class DummyChannelPipeline extends io.netty.channel.DefaultChannelPipeline {
    public static final io.netty.channel.ChannelPipeline DUMMY_INSTANCE = new DummyChannelPipeline(null);
    public DummyChannelPipeline(io.netty.channel.Channel channel) {
        super(channel);
    }
}
