package net.md_5.bungee;

import net.md_5.bungee.protocol.packet.ClientStatus;
import net.md_5.bungee.protocol.packet.PluginMessage;
import net.md_5.bungee.protocol.packet.RespawnOld;

public class PacketConstants
{

    public static final RespawnOld DIM1_SWITCH = new RespawnOld( (byte) 1, (byte) 0, (byte) 0, "default" );
    public static final RespawnOld DIM2_SWITCH = new RespawnOld( (byte) -1, (byte) 0, (byte) 0, "default" );
    public static final ClientStatus CLIENT_LOGIN = new ClientStatus( (byte) 0 );
    public static final PluginMessage FORGE_MOD_REQUEST = new PluginMessage( "FML", new byte[]
    {
        0, 0, 0, 0, 0, 2
    }, false );
}
