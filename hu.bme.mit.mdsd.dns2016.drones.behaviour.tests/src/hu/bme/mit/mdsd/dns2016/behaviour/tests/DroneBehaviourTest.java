/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.tests;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drone Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneBehaviourTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DroneBehaviourTest.class);
	}

	/**
	 * Constructs a new Drone Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drone Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DroneBehaviour getFixture() {
		return (DroneBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createDroneBehaviour());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DroneBehaviourTest
