
/*  AUTOMATICALLY CONVERTED FILE  */

package enums;

public enum ClientPacketID {
	LoginExistingChar, ThrowDices, LoginNewChar, Talk, Yell, Whisper, Walk, RequestPositionUpdate, Attack, PickUp, SafeToggle, ResuscitationSafeToggle, RequestGuildLeaderInfo, RequestAtributes, RequestFame, RequestSkills, RequestMiniStats, CommerceEnd, UserCommerceEnd, UserCommerceConfirm, CommerceChat, BankEnd, UserCommerceOk, UserCommerceReject, Drop, CastSpell, LeftClick, DoubleClick, Work, UseSpellMacro, UseItem, CraftBlacksmith, CraftCarpenter, WorkLeftClick, CreateNewGuild, SpellInfo, EquipItem, ChangeHeading, ModifySkills, Train, CommerceBuy, BankExtractItem, CommerceSell, BankDeposit, ForumPost, MoveSpell, MoveBank, ClanCodexUpdate, UserCommerceOffer, GuildAcceptPeace, GuildRejectAlliance, GuildRejectPeace, GuildAcceptAlliance, GuildOfferPeace, GuildOfferAlliance, GuildAllianceDetails, GuildPeaceDetails, GuildRequestJoinerInfo, GuildAlliancePropList, GuildPeacePropList, GuildDeclareWar, GuildNewWebsite, GuildAcceptNewMember, GuildRejectNewMember, GuildKickMember, GuildUpdateNews, GuildMemberInfo, GuildOpenElections, GuildRequestMembership, GuildRequestDetails, Online, Quit, GuildLeave, RequestAccountState, PetStand, PetFollow, ReleasePet, TrainList, Rest, Meditate, Resucitate, Heal, Help, RequestStats, CommerceStart, BankStart, Enlist, Information, Reward, RequestMOTD, UpTime, PartyLeave, PartyCreate, PartyJoin, Inquiry, GuildMessage, PartyMessage, CentinelReport, GuildOnline, PartyOnline, CouncilMessage, RoleMasterRequest, GMRequest, bugReport, ChangeDescription, GuildVote, Punishments, ChangePassword, Gamble, InquiryVote, LeaveFaction, BankExtractGold, BankDepositGold, Denounce, GuildFundate, GuildFundation, PartyKick, PartySetLeader, PartyAcceptMember, Ping, RequestPartyForm, ItemUpgrade, GMCommands, InitCrafting, Home, ShowGuildNews, ShareNpc, StopSharingNpc, Consultation, moveItem;
	public static ClientPacketID fromInteger(int x) {
		switch (x) {
		case 0:
			return LoginExistingChar;
		case 1:
			return ThrowDices;
		case 2:
			return LoginNewChar;
		case 3:
			return Talk;
		case 4:
			return Yell;
		case 5:
			return Whisper;
		case 6:
			return Walk;
		case 7:
			return RequestPositionUpdate;
		case 8:
			return Attack;
		case 9:
			return PickUp;
		case 10:
			return SafeToggle;
		case 11:
			return ResuscitationSafeToggle;
		case 12:
			return RequestGuildLeaderInfo;
		case 13:
			return RequestAtributes;
		case 14:
			return RequestFame;
		case 15:
			return RequestSkills;
		case 16:
			return RequestMiniStats;
		case 17:
			return CommerceEnd;
		case 18:
			return UserCommerceEnd;
		case 19:
			return UserCommerceConfirm;
		case 20:
			return CommerceChat;
		case 21:
			return BankEnd;
		case 22:
			return UserCommerceOk;
		case 23:
			return UserCommerceReject;
		case 24:
			return Drop;
		case 25:
			return CastSpell;
		case 26:
			return LeftClick;
		case 27:
			return DoubleClick;
		case 28:
			return Work;
		case 29:
			return UseSpellMacro;
		case 30:
			return UseItem;
		case 31:
			return CraftBlacksmith;
		case 32:
			return CraftCarpenter;
		case 33:
			return WorkLeftClick;
		case 34:
			return CreateNewGuild;
		case 35:
			return SpellInfo;
		case 36:
			return EquipItem;
		case 37:
			return ChangeHeading;
		case 38:
			return ModifySkills;
		case 39:
			return Train;
		case 40:
			return CommerceBuy;
		case 41:
			return BankExtractItem;
		case 42:
			return CommerceSell;
		case 43:
			return BankDeposit;
		case 44:
			return ForumPost;
		case 45:
			return MoveSpell;
		case 46:
			return MoveBank;
		case 47:
			return ClanCodexUpdate;
		case 48:
			return UserCommerceOffer;
		case 49:
			return GuildAcceptPeace;
		case 50:
			return GuildRejectAlliance;
		case 51:
			return GuildRejectPeace;
		case 52:
			return GuildAcceptAlliance;
		case 53:
			return GuildOfferPeace;
		case 54:
			return GuildOfferAlliance;
		case 55:
			return GuildAllianceDetails;
		case 56:
			return GuildPeaceDetails;
		case 57:
			return GuildRequestJoinerInfo;
		case 58:
			return GuildAlliancePropList;
		case 59:
			return GuildPeacePropList;
		case 60:
			return GuildDeclareWar;
		case 61:
			return GuildNewWebsite;
		case 62:
			return GuildAcceptNewMember;
		case 63:
			return GuildRejectNewMember;
		case 64:
			return GuildKickMember;
		case 65:
			return GuildUpdateNews;
		case 66:
			return GuildMemberInfo;
		case 67:
			return GuildOpenElections;
		case 68:
			return GuildRequestMembership;
		case 69:
			return GuildRequestDetails;
		case 70:
			return Online;
		case 71:
			return Quit;
		case 72:
			return GuildLeave;
		case 73:
			return RequestAccountState;
		case 74:
			return PetStand;
		case 75:
			return PetFollow;
		case 76:
			return ReleasePet;
		case 77:
			return TrainList;
		case 78:
			return Rest;
		case 79:
			return Meditate;
		case 80:
			return Resucitate;
		case 81:
			return Heal;
		case 82:
			return Help;
		case 83:
			return RequestStats;
		case 84:
			return CommerceStart;
		case 85:
			return BankStart;
		case 86:
			return Enlist;
		case 87:
			return Information;
		case 88:
			return Reward;
		case 89:
			return RequestMOTD;
		case 90:
			return UpTime;
		case 91:
			return PartyLeave;
		case 92:
			return PartyCreate;
		case 93:
			return PartyJoin;
		case 94:
			return Inquiry;
		case 95:
			return GuildMessage;
		case 96:
			return PartyMessage;
		case 97:
			return CentinelReport;
		case 98:
			return GuildOnline;
		case 99:
			return PartyOnline;
		case 100:
			return CouncilMessage;
		case 101:
			return RoleMasterRequest;
		case 102:
			return GMRequest;
		case 103:
			return bugReport;
		case 104:
			return ChangeDescription;
		case 105:
			return GuildVote;
		case 106:
			return Punishments;
		case 107:
			return ChangePassword;
		case 108:
			return Gamble;
		case 109:
			return InquiryVote;
		case 110:
			return LeaveFaction;
		case 111:
			return BankExtractGold;
		case 112:
			return BankDepositGold;
		case 113:
			return Denounce;
		case 114:
			return GuildFundate;
		case 115:
			return GuildFundation;
		case 116:
			return PartyKick;
		case 117:
			return PartySetLeader;
		case 118:
			return PartyAcceptMember;
		case 119:
			return Ping;
		case 120:
			return RequestPartyForm;
		case 121:
			return ItemUpgrade;
		case 122:
			return GMCommands;
		case 123:
			return InitCrafting;
		case 124:
			return Home;
		case 125:
			return ShowGuildNews;
		case 126:
			return ShareNpc;
		case 127:
			return StopSharingNpc;
		case 128:
			return Consultation;
		case 129:
			return moveItem;
		}
		return null;
	}

	public static int toInteger(ClientPacketID x) {
		switch (x) {
		case LoginExistingChar:
			return 0;
		case ThrowDices:
			return 1;
		case LoginNewChar:
			return 2;
		case Talk:
			return 3;
		case Yell:
			return 4;
		case Whisper:
			return 5;
		case Walk:
			return 6;
		case RequestPositionUpdate:
			return 7;
		case Attack:
			return 8;
		case PickUp:
			return 9;
		case SafeToggle:
			return 10;
		case ResuscitationSafeToggle:
			return 11;
		case RequestGuildLeaderInfo:
			return 12;
		case RequestAtributes:
			return 13;
		case RequestFame:
			return 14;
		case RequestSkills:
			return 15;
		case RequestMiniStats:
			return 16;
		case CommerceEnd:
			return 17;
		case UserCommerceEnd:
			return 18;
		case UserCommerceConfirm:
			return 19;
		case CommerceChat:
			return 20;
		case BankEnd:
			return 21;
		case UserCommerceOk:
			return 22;
		case UserCommerceReject:
			return 23;
		case Drop:
			return 24;
		case CastSpell:
			return 25;
		case LeftClick:
			return 26;
		case DoubleClick:
			return 27;
		case Work:
			return 28;
		case UseSpellMacro:
			return 29;
		case UseItem:
			return 30;
		case CraftBlacksmith:
			return 31;
		case CraftCarpenter:
			return 32;
		case WorkLeftClick:
			return 33;
		case CreateNewGuild:
			return 34;
		case SpellInfo:
			return 35;
		case EquipItem:
			return 36;
		case ChangeHeading:
			return 37;
		case ModifySkills:
			return 38;
		case Train:
			return 39;
		case CommerceBuy:
			return 40;
		case BankExtractItem:
			return 41;
		case CommerceSell:
			return 42;
		case BankDeposit:
			return 43;
		case ForumPost:
			return 44;
		case MoveSpell:
			return 45;
		case MoveBank:
			return 46;
		case ClanCodexUpdate:
			return 47;
		case UserCommerceOffer:
			return 48;
		case GuildAcceptPeace:
			return 49;
		case GuildRejectAlliance:
			return 50;
		case GuildRejectPeace:
			return 51;
		case GuildAcceptAlliance:
			return 52;
		case GuildOfferPeace:
			return 53;
		case GuildOfferAlliance:
			return 54;
		case GuildAllianceDetails:
			return 55;
		case GuildPeaceDetails:
			return 56;
		case GuildRequestJoinerInfo:
			return 57;
		case GuildAlliancePropList:
			return 58;
		case GuildPeacePropList:
			return 59;
		case GuildDeclareWar:
			return 60;
		case GuildNewWebsite:
			return 61;
		case GuildAcceptNewMember:
			return 62;
		case GuildRejectNewMember:
			return 63;
		case GuildKickMember:
			return 64;
		case GuildUpdateNews:
			return 65;
		case GuildMemberInfo:
			return 66;
		case GuildOpenElections:
			return 67;
		case GuildRequestMembership:
			return 68;
		case GuildRequestDetails:
			return 69;
		case Online:
			return 70;
		case Quit:
			return 71;
		case GuildLeave:
			return 72;
		case RequestAccountState:
			return 73;
		case PetStand:
			return 74;
		case PetFollow:
			return 75;
		case ReleasePet:
			return 76;
		case TrainList:
			return 77;
		case Rest:
			return 78;
		case Meditate:
			return 79;
		case Resucitate:
			return 80;
		case Heal:
			return 81;
		case Help:
			return 82;
		case RequestStats:
			return 83;
		case CommerceStart:
			return 84;
		case BankStart:
			return 85;
		case Enlist:
			return 86;
		case Information:
			return 87;
		case Reward:
			return 88;
		case RequestMOTD:
			return 89;
		case UpTime:
			return 90;
		case PartyLeave:
			return 91;
		case PartyCreate:
			return 92;
		case PartyJoin:
			return 93;
		case Inquiry:
			return 94;
		case GuildMessage:
			return 95;
		case PartyMessage:
			return 96;
		case CentinelReport:
			return 97;
		case GuildOnline:
			return 98;
		case PartyOnline:
			return 99;
		case CouncilMessage:
			return 100;
		case RoleMasterRequest:
			return 101;
		case GMRequest:
			return 102;
		case bugReport:
			return 103;
		case ChangeDescription:
			return 104;
		case GuildVote:
			return 105;
		case Punishments:
			return 106;
		case ChangePassword:
			return 107;
		case Gamble:
			return 108;
		case InquiryVote:
			return 109;
		case LeaveFaction:
			return 110;
		case BankExtractGold:
			return 111;
		case BankDepositGold:
			return 112;
		case Denounce:
			return 113;
		case GuildFundate:
			return 114;
		case GuildFundation:
			return 115;
		case PartyKick:
			return 116;
		case PartySetLeader:
			return 117;
		case PartyAcceptMember:
			return 118;
		case Ping:
			return 119;
		case RequestPartyForm:
			return 120;
		case ItemUpgrade:
			return 121;
		case GMCommands:
			return 122;
		case InitCrafting:
			return 123;
		case Home:
			return 124;
		case ShowGuildNews:
			return 125;
		case ShareNpc:
			return 126;
		case StopSharingNpc:
			return 127;
		case Consultation:
			return 128;
		case moveItem:
			return 129;
		}
		return 0;
	}

	public int toInteger() {
		return toInteger(this);
	}
}
