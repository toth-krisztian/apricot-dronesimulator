/*
 * generated by Xtext 2.9.2
 */
grammar InternalDronesDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package hu.bme.mit.mdsd.dns2016.drones.text.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package hu.bme.mit.mdsd.dns2016.drones.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.mdsd.dns2016.drones.text.services.DronesDslGrammarAccess;

}
@parser::members {
	private DronesDslGrammarAccess grammarAccess;

	public void setGrammarAccess(DronesDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMission
entryRuleMission
:
{ before(grammarAccess.getMissionRule()); }
	 ruleMission
{ after(grammarAccess.getMissionRule()); } 
	 EOF 
;

// Rule Mission
ruleMission 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMissionAccess().getGroup()); }
		(rule__Mission__Group__0)
		{ after(grammarAccess.getMissionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDrone
entryRuleDrone
:
{ before(grammarAccess.getDroneRule()); }
	 ruleDrone
{ after(grammarAccess.getDroneRule()); } 
	 EOF 
;

// Rule Drone
ruleDrone 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDroneAccess().getGroup()); }
		(rule__Drone__Group__0)
		{ after(grammarAccess.getDroneAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFieldObject
entryRuleFieldObject
:
{ before(grammarAccess.getFieldObjectRule()); }
	 ruleFieldObject
{ after(grammarAccess.getFieldObjectRule()); } 
	 EOF 
;

// Rule FieldObject
ruleFieldObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldObjectAccess().getAlternatives()); }
		(rule__FieldObject__Alternatives)
		{ after(grammarAccess.getFieldObjectAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChargeStation
entryRuleChargeStation
:
{ before(grammarAccess.getChargeStationRule()); }
	 ruleChargeStation
{ after(grammarAccess.getChargeStationRule()); } 
	 EOF 
;

// Rule ChargeStation
ruleChargeStation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChargeStationAccess().getGroup()); }
		(rule__ChargeStation__Group__0)
		{ after(grammarAccess.getChargeStationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMovableObject
entryRuleMovableObject
:
{ before(grammarAccess.getMovableObjectRule()); }
	 ruleMovableObject
{ after(grammarAccess.getMovableObjectRule()); } 
	 EOF 
;

// Rule MovableObject
ruleMovableObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMovableObjectAccess().getGroup()); }
		(rule__MovableObject__Group__0)
		{ after(grammarAccess.getMovableObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImmovableObject
entryRuleImmovableObject
:
{ before(grammarAccess.getImmovableObjectRule()); }
	 ruleImmovableObject
{ after(grammarAccess.getImmovableObjectRule()); } 
	 EOF 
;

// Rule ImmovableObject
ruleImmovableObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImmovableObjectAccess().getGroup()); }
		(rule__ImmovableObject__Group__0)
		{ after(grammarAccess.getImmovableObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getNameAssignment()); }
		(rule__Action__NameAssignment)
		{ after(grammarAccess.getActionAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldObject__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldObjectAccess().getChargeStationParserRuleCall_0()); }
		ruleChargeStation
		{ after(grammarAccess.getFieldObjectAccess().getChargeStationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFieldObjectAccess().getMovableObjectParserRuleCall_1()); }
		ruleMovableObject
		{ after(grammarAccess.getFieldObjectAccess().getMovableObjectParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getFieldObjectAccess().getImmovableObjectParserRuleCall_2()); }
		ruleImmovableObject
		{ after(grammarAccess.getFieldObjectAccess().getImmovableObjectParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__0__Impl
	rule__Mission__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getMissionAction_0()); }
	()
	{ after(grammarAccess.getMissionAccess().getMissionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__1__Impl
	rule__Mission__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getMissionKeyword_1()); }
	'Mission'
	{ after(grammarAccess.getMissionAccess().getMissionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__2__Impl
	rule__Mission__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__3__Impl
	rule__Mission__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_3()); }
	(rule__Mission__Group_3__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__4__Impl
	rule__Mission__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__5__Impl
	rule__Mission__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_5()); }
	(rule__Mission__Group_5__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__6__Impl
	rule__Mission__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_6()); }
	(rule__Mission__Group_6__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__0__Impl
	rule__Mission__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getActionsKeyword_3_0()); }
	'Actions'
	{ after(grammarAccess.getMissionAccess().getActionsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__1__Impl
	rule__Mission__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__2__Impl
	rule__Mission__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getActionsAssignment_3_2()); }
	(rule__Mission__ActionsAssignment_3_2)
	{ after(grammarAccess.getMissionAccess().getActionsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_3_3()); }
	(rule__Mission__Group_3_3__0)*
	{ after(grammarAccess.getMissionAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3_3__0__Impl
	rule__Mission__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getMissionAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getActionsAssignment_3_3_1()); }
	(rule__Mission__ActionsAssignment_3_3_1)
	{ after(grammarAccess.getMissionAccess().getActionsAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_5__0__Impl
	rule__Mission__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getDronesAssignment_5_0()); }
	(rule__Mission__DronesAssignment_5_0)
	{ after(grammarAccess.getMissionAccess().getDronesAssignment_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getDronesAssignment_5_1()); }
	(rule__Mission__DronesAssignment_5_1)*
	{ after(grammarAccess.getMissionAccess().getDronesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_6__0__Impl
	rule__Mission__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_0()); }
	(rule__Mission__FieldObjectsAssignment_6_0)
	{ after(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_1()); }
	(rule__Mission__FieldObjectsAssignment_6_1)*
	{ after(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Drone__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group__0__Impl
	rule__Drone__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getDroneKeyword_0()); }
	'Drone'
	{ after(grammarAccess.getDroneAccess().getDroneKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group__1__Impl
	rule__Drone__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getNameAssignment_1()); }
	(rule__Drone__NameAssignment_1)
	{ after(grammarAccess.getDroneAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getGroup_2()); }
	(rule__Drone__Group_2__0)?
	{ after(grammarAccess.getDroneAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Drone__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2__0__Impl
	rule__Drone__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2__1__Impl
	rule__Drone__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getGroup_2_1()); }
	(rule__Drone__Group_2_1__0)?
	{ after(grammarAccess.getDroneAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Drone__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2_1__0__Impl
	rule__Drone__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_0()); }
	(rule__Drone__SupportedActionsAssignment_2_1_0)
	{ after(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getGroup_2_1_1()); }
	(rule__Drone__Group_2_1_1__0)*
	{ after(grammarAccess.getDroneAccess().getGroup_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Drone__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2_1_1__0__Impl
	rule__Drone__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getCommaKeyword_2_1_1_0()); }
	','
	{ after(grammarAccess.getDroneAccess().getCommaKeyword_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Drone__Group_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_1_1()); }
	(rule__Drone__SupportedActionsAssignment_2_1_1_1)
	{ after(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChargeStation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChargeStation__Group__0__Impl
	rule__ChargeStation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChargeStationAccess().getChargeStationKeyword_0()); }
	'ChargeStation'
	{ after(grammarAccess.getChargeStationAccess().getChargeStationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChargeStation__Group__1__Impl
	rule__ChargeStation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChargeStationAccess().getNameAssignment_1()); }
	(rule__ChargeStation__NameAssignment_1)
	{ after(grammarAccess.getChargeStationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChargeStation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChargeStationAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getChargeStationAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MovableObject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MovableObject__Group__0__Impl
	rule__MovableObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMovableObjectAccess().getMovableObjectKeyword_0()); }
	'MovableObject'
	{ after(grammarAccess.getMovableObjectAccess().getMovableObjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MovableObject__Group__1__Impl
	rule__MovableObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMovableObjectAccess().getNameAssignment_1()); }
	(rule__MovableObject__NameAssignment_1)
	{ after(grammarAccess.getMovableObjectAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MovableObject__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMovableObjectAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getMovableObjectAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImmovableObject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImmovableObject__Group__0__Impl
	rule__ImmovableObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImmovableObjectAccess().getImmovableObjectKeyword_0()); }
	'ImmovableObject'
	{ after(grammarAccess.getImmovableObjectAccess().getImmovableObjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImmovableObject__Group__1__Impl
	rule__ImmovableObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImmovableObjectAccess().getNameAssignment_1()); }
	(rule__ImmovableObject__NameAssignment_1)
	{ after(grammarAccess.getImmovableObjectAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImmovableObject__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImmovableObjectAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getImmovableObjectAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__ActionsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_2_0()); }
		ruleAction
		{ after(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__ActionsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_3_1_0()); }
		ruleAction
		{ after(grammarAccess.getMissionAccess().getActionsActionParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__DronesAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_0_0()); }
		ruleDrone
		{ after(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__DronesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_1_0()); }
		ruleDrone
		{ after(grammarAccess.getMissionAccess().getDronesDroneParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__FieldObjectsAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_0_0()); }
		ruleFieldObject
		{ after(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__FieldObjectsAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_1_0()); }
		ruleFieldObject
		{ after(grammarAccess.getMissionAccess().getFieldObjectsFieldObjectParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__SupportedActionsAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_0_0()); }
		(
			{ before(grammarAccess.getDroneAccess().getSupportedActionsActionEStringParserRuleCall_2_1_0_0_1()); }
			ruleEString
			{ after(grammarAccess.getDroneAccess().getSupportedActionsActionEStringParserRuleCall_2_1_0_0_1()); }
		)
		{ after(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Drone__SupportedActionsAssignment_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_1_1_0()); }
		(
			{ before(grammarAccess.getDroneAccess().getSupportedActionsActionEStringParserRuleCall_2_1_1_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getDroneAccess().getSupportedActionsActionEStringParserRuleCall_2_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getDroneAccess().getSupportedActionsActionCrossReference_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChargeStation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChargeStationAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getChargeStationAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MovableObject__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMovableObjectAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getMovableObjectAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImmovableObject__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImmovableObjectAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getImmovableObjectAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0()); }
		ruleEString
		{ after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
