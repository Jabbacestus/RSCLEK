package com.openrsc.server.net.rsc.struct.incoming;

import com.openrsc.server.net.rsc.enums.OpcodeIn;
import com.openrsc.server.net.rsc.struct.AbstractStruct;

public class GameSettingStruct extends AbstractStruct<OpcodeIn> {

	public int index;
	public int value;
	public int cameraModeAuto;
	public int playerKiller;
	public int mouseButtonOne;
	public int soundDisabled;
}
