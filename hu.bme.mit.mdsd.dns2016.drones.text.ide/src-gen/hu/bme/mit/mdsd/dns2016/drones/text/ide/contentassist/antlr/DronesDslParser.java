/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.text.ide.contentassist.antlr;

import com.google.inject.Inject;
import hu.bme.mit.mdsd.dns2016.drones.text.ide.contentassist.antlr.internal.InternalDronesDslParser;
import hu.bme.mit.mdsd.dns2016.drones.text.services.DronesDslGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DronesDslParser extends AbstractContentAssistParser {

	@Inject
	private DronesDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDronesDslParser createParser() {
		InternalDronesDslParser result = new InternalDronesDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFieldObjectAccess().getAlternatives(), "rule__FieldObject__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getMissionAccess().getGroup_3(), "rule__Mission__Group_3__0");
					put(grammarAccess.getMissionAccess().getGroup_3_3(), "rule__Mission__Group_3_3__0");
					put(grammarAccess.getMissionAccess().getGroup_5(), "rule__Mission__Group_5__0");
					put(grammarAccess.getMissionAccess().getGroup_6(), "rule__Mission__Group_6__0");
					put(grammarAccess.getDroneAccess().getGroup(), "rule__Drone__Group__0");
					put(grammarAccess.getDroneAccess().getGroup_2(), "rule__Drone__Group_2__0");
					put(grammarAccess.getDroneAccess().getGroup_2_1(), "rule__Drone__Group_2_1__0");
					put(grammarAccess.getDroneAccess().getGroup_2_1_1(), "rule__Drone__Group_2_1_1__0");
					put(grammarAccess.getChargeStationAccess().getGroup(), "rule__ChargeStation__Group__0");
					put(grammarAccess.getMovableObjectAccess().getGroup(), "rule__MovableObject__Group__0");
					put(grammarAccess.getImmovableObjectAccess().getGroup(), "rule__ImmovableObject__Group__0");
					put(grammarAccess.getMissionAccess().getActionsAssignment_3_2(), "rule__Mission__ActionsAssignment_3_2");
					put(grammarAccess.getMissionAccess().getActionsAssignment_3_3_1(), "rule__Mission__ActionsAssignment_3_3_1");
					put(grammarAccess.getMissionAccess().getDronesAssignment_5_0(), "rule__Mission__DronesAssignment_5_0");
					put(grammarAccess.getMissionAccess().getDronesAssignment_5_1(), "rule__Mission__DronesAssignment_5_1");
					put(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_0(), "rule__Mission__FieldObjectsAssignment_6_0");
					put(grammarAccess.getMissionAccess().getFieldObjectsAssignment_6_1(), "rule__Mission__FieldObjectsAssignment_6_1");
					put(grammarAccess.getDroneAccess().getNameAssignment_1(), "rule__Drone__NameAssignment_1");
					put(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_0(), "rule__Drone__SupportedActionsAssignment_2_1_0");
					put(grammarAccess.getDroneAccess().getSupportedActionsAssignment_2_1_1_1(), "rule__Drone__SupportedActionsAssignment_2_1_1_1");
					put(grammarAccess.getChargeStationAccess().getNameAssignment_1(), "rule__ChargeStation__NameAssignment_1");
					put(grammarAccess.getMovableObjectAccess().getNameAssignment_1(), "rule__MovableObject__NameAssignment_1");
					put(grammarAccess.getImmovableObjectAccess().getNameAssignment_1(), "rule__ImmovableObject__NameAssignment_1");
					put(grammarAccess.getActionAccess().getNameAssignment(), "rule__Action__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDronesDslParser typedParser = (InternalDronesDslParser) parser;
			typedParser.entryRuleMission();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DronesDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DronesDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
