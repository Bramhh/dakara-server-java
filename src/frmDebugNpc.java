
/*  AUTOMATICALLY CONVERTED FILE  */
/* [(0, 'ATTRIBUTE'), (1, 'VB_Name'), (5, '='), (4, '"frmDebugNpc"')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_GlobalNameSpace'), (5, '='), (1, 'False')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_Creatable'), (5, '='), (1, 'False')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_PredeclaredId'), (5, '='), (1, 'True')] */
/* [(0, 'ATTRIBUTE'), (1, 'VB_Exposed'), (5, '='), (1, 'False')] */
/* 'Argentum Online 0.12.2 */
/* 'Copyright (C) 2002 Márquez Pablo Ignacio */
/* ' */
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
/* ' */
/* 'Argentum Online is based on Baronsoft's VB6 Online RPG */
/* 'You can contact the original creator of ORE at aaron@baronsoft.com */
/* 'for more information about ORE please visit http://www.baronsoft.com/ */
/* ' */
/* ' */
/* 'You can contact me at: */
/* 'morgolock@speedy.com.ar */
/* 'www.geocities.com/gmorgolock */
/* 'Calle 3 número 983 piso 7 dto A */
/* 'La Plata - Pcia, Buenos Aires - Republica Argentina */
/* 'Código Postal 1900 */
/* 'Pablo Ignacio Márquez */

import enums.*;

public class frmDebugNpc {

	static void Command1_Click() {
		int i = 0;
		int k = 0;

		for (i = (1); i <= (Declaraciones.LastNPC); i++) {
			if (Declaraciones.Npclist[i].flags.NPCActive) {
				k = k + 1;
			}
		}

		Label1.Caption = "Npcs Activos:" + k;
		Label2.Caption = "Npcs Libres:" + Declaraciones.MAXNPCS - k;
		Label3.Caption = "LastNpcIndex:" + Declaraciones.LastNPC;
		Label4.Caption = "MAXNPCS:" + Declaraciones.MAXNPCS;

	}

	static void Command2_Click() {
		Unload(Me);
	}

}