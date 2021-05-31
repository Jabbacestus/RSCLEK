package orsc.net;

public class Opcodes {
	public enum In {

	}

	public enum Out {
		PING(67),
		WALK_TO_ENTITY(16),
		WALK_TO_POINT(187),
		CONFIRM_LOGOUT(31),
		LOGOUT(102),
		ADD_FRIEND(195),
		ADD_IGNORE(132),
		BLINK(59),
		COMBAT_STYLE_CHANGED(29),
		QUESTION_DIALOG_ANSWER(116),

		PLAYER_APPEARANCE_CHANGE(235),
		SOCIAL_ADD_IGNORE(132),
		SOCIAL_ADD_DELAYED_IGNORE(194),
		SOCIAL_ADD_FRIEND(195),
		SOCIAL_SEND_PRIVATE_MESSAGE(218),
		SOCIAL_REMOVE_FRIEND(167),
		SOCIAL_REMOVE_IGNORE(241),

		DUEL_FIRST_SETTINGS_CHANGED(8),
		DUEL_FIRST_ACCEPTED(176),
		DUEL_DECLINED(197),
		DUEL_OFFER_ITEM(33),
		DUEL_SECOND_ACCEPTED(77),

		WALL_OBJECT_COMMAND1(14),
		WALL_OBJECT_COMMAND2(127),
		WALL_OBJECT_CAST(180),
		WALL_USE_ITEM(161),

		NPC_TALK_TO(153),
		NPC_COMMAND1(202),
		NPC_COMMAND2(203),
		NPC_ATTACK1(190),
		NPC_CAST_SPELL(50),
		NPC_USE_ITEM(135),

		PLAYER_CAST_SPELL(229),
		PLAYER_USE_ITEM(113),
		PLAYER_ATTACK(171),
		PLAYER_DUEL(103),
		PLAYER_TRADE(142),
		PLAYER_FOLLOW(165),

		GROUND_ITEM_CAST_SPELL(249),
		GROUND_ITEM_USE_ITEM(53),
		GROUND_ITEM_TAKE(247),

		ITEM_CAST_SPELL(4),
		ITEM_USE_ITEM(91),
		ITEM_UNEQUIP_FROM_EQUIPMENT(168),
		ITEM_UNEQUIP_FROM_INVENTORY(170),
		ITEM_EQUIP_FROM_INVENTORY(169),
		ITEM_EQUIP_FROM_BANK(172),
		ITEM_REMOVE_TO_BANK(173),
		ITEM_COMMAND(90),
		ITEM_DROP(246),

		CAST_ON_SELF(137),
		CAST_ON_LAND(158),

		OBJECT_COMMAND1(136),
		OBJECT_COMMAND2(79),
		OBJECT_CAST(99),
		OBJECT_USE_ITEM(115),

		SHOP_CLOSE(166),
		SHOP_BUY(236),
		SHOP_SELL(221),

		TRADE_ACCEPTED(55),
		TRADE_DECLINED(230),
		TRADE_OFFER(46),
		TRADE_CONFIRM_ACCEPTED(104),

		PRAYER_ACTIVATED(60),
		PRAYER_DEACTIVATED(254),

		GAME_SETTINGS_CHANGED(111),
		CHAT_MESSAGE(216),
		COMMAND(38),
		PRIVACY_SETTINGS_CHANGED(64),
		REPORT_ABUSE(206),
		BANK_CLOSE(212),
		BANK_WITHDRAW(22),
		BANK_DEPOSIT(23),
		BANK_DEPOSIT_ALL_FROM_INVENTORY(24),
		BANK_DEPOSIT_ALL_FROM_EQUIPMENT(26),
		BANK_SAVE_PRESET(27),
		BANK_LOAD_PRESET(28),
		INTERFACE_OPTIONS(199),
		CHANGE_PASS(25),
		CANCEL_RECOVERY_REQUEST(196),
		CHANGE_RECOVERY(200),
		SET_RECOVERY(208),
		CHANGE_DETAILS(201),
		SET_DETAILS(253),

		SLEEPWORD_ENTERED(45),

		ON_TUTORIAL_ISLAND(84),
		ON_BLACK_HOLE(86),
		NPC_DEFINITION_REQUEST(89),
		;

		private int opcode;

		private Out(int opcode) {
			this.setOpcode(opcode);
		}

		public int getOpcode() {
			return opcode;
		}

		public void setOpcode(int opcode) {
			this.opcode = opcode;
		}
	}

}
