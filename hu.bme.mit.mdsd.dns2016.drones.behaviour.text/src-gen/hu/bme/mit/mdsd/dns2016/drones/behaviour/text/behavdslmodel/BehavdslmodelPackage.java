/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavdslmodelFactory
 * @model kind="package"
 * @generated
 */
public interface BehavdslmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "behavdslmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "hu.bme.mit.mdsd.dns2016.drones.behaviour.BehavDSLModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "behavdslmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BehavdslmodelPackage eINSTANCE = hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavdslmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavDSLImpl <em>Behav DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavDSLImpl
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavdslmodelPackageImpl#getBehavDSL()
   * @generated
   */
  int BEHAV_DSL = 0;

  /**
   * The feature id for the '<em><b>Imported Mission</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAV_DSL__IMPORTED_MISSION = 0;

  /**
   * The feature id for the '<em><b>Behav</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAV_DSL__BEHAV = 1;

  /**
   * The number of structural features of the '<em>Behav DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAV_DSL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.ImportImpl
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavdslmodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_NAME = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL <em>Behav DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behav DSL</em>'.
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL
   * @generated
   */
  EClass getBehavDSL();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL#getImportedMission <em>Imported Mission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imported Mission</em>'.
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL#getImportedMission()
   * @see #getBehavDSL()
   * @generated
   */
  EReference getBehavDSL_ImportedMission();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL#getBehav <em>Behav</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behav</em>'.
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL#getBehav()
   * @see #getBehavDSL()
   * @generated
   */
  EReference getBehavDSL_Behav();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.Import#getImportName <em>Import Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import Name</em>'.
   * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.Import#getImportName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BehavdslmodelFactory getBehavdslmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavDSLImpl <em>Behav DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavDSLImpl
     * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavdslmodelPackageImpl#getBehavDSL()
     * @generated
     */
    EClass BEHAV_DSL = eINSTANCE.getBehavDSL();

    /**
     * The meta object literal for the '<em><b>Imported Mission</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAV_DSL__IMPORTED_MISSION = eINSTANCE.getBehavDSL_ImportedMission();

    /**
     * The meta object literal for the '<em><b>Behav</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAV_DSL__BEHAV = eINSTANCE.getBehavDSL_Behav();

    /**
     * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.ImportImpl
     * @see hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.impl.BehavdslmodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_NAME = eINSTANCE.getImport_ImportName();

  }

} //BehavdslmodelPackage
