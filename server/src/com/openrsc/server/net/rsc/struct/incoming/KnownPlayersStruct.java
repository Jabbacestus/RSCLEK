package com.openrsc.server.net.rsc.struct.incoming;

import com.openrsc.server.net.rsc.enums.OpcodeIn;
import com.openrsc.server.net.rsc.struct.AbstractStruct;

public class KnownPlayersStruct extends AbstractStruct<OpcodeIn> {

	public int playerCount;
	public int[] playerServerIndex;
	public int[] playerServerId;
}
