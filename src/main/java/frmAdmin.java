/*  AUTOMATICALLY CONVERTED FILE  */

/* 
 * Este archivo fue convertido automaticamente, por un script, desde el 
 * código fuente original de Visual Basic 6.
 */

/* [(0, 'ATTRIBUTE'), (1, 'VB_Name'), (5, '='), (4, '"frmAdmin"')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_GlobalNameSpace'), (5, '='), (1, 'False')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_Creatable'), (5, '='), (1, 'False')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_PredeclaredId'), (5, '='), (1, 'True')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_Exposed'), (5, '='), (1, 'False')] */
/* '************************************************************** */
/* ' frmAdmin.frm */
/* ' */
/* '************************************************************** */

/* '************************************************************************** */
/* 'This program is free software; you can redistribute it and/or modify */
/* 'it under the terms of the Affero General Public License; */
/* 'either version 1 of the License, or any later version. */
/* ' */
/* 'This program is distributed in the hope that it will be useful, */
/* 'but WITHOUT ANY WARRANTY; without even the implied warranty of */
/* 'MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the */
/* 'Affero General Public License for more details. */
/* ' */
/* 'You should have received a copy of the Affero General Public License */
/* 'along with this program; if not, you can find it at http://www.affero.org/oagpl.html */
/* '************************************************************************** */

import enums.*;

public class frmAdmin {

	public static void cboPjs_Change() {
		ActualizaPjInfo();
	}

	public static void cboPjs_Click() {
		ActualizaPjInfo();
	}

	public static void Command1_Click() {
		int tIndex = 0;

		tIndex = Extra.NameIndex(cboPjs.Text);
		if (tIndex > 0) {
			modSendData.SendData(SendTarget.ToAll, 0,
					Protocol.PrepareMessageConsoleMsg(
							"Servidor> " + Declaraciones.UserList[tIndex].Name + " ha sido echado.",
							FontTypeNames.FONTTYPE_SERVER));
			TCP.CloseSocket(tIndex);
		}

	}

	public static void ActualizaListaPjs() {
		int LoopC = 0;

		cboPjs.Clear();

		for (LoopC = (1); LoopC <= (Declaraciones.LastUser); LoopC++) {
			if (Declaraciones.UserList[LoopC].flags.UserLogged && Declaraciones.UserList[LoopC].ConnID >= 0
					&& Declaraciones.UserList[LoopC].ConnIDValida) {
				if (Declaraciones.UserList[LoopC].flags.Privilegios && PlayerType.User) {
					cboPjs.AddItem(Declaraciones.UserList[LoopC].Name);
					cboPjs.ItemData[cboPjs.NewIndex] = LoopC;
				}
			}
		}

	}

	public static void Command3_Click() {
		TCP.EcharPjsNoPrivilegiados();
	}

	public static void ActualizaPjInfo() {
		int tIndex = 0;

		tIndex = Extra.NameIndex(cboPjs.Text);
		if (tIndex > 0) {
			Text1.Text = Declaraciones.UserList[tIndex].outgoingData.length + " elementos en cola." + vbCrLf;
		}

	}

}