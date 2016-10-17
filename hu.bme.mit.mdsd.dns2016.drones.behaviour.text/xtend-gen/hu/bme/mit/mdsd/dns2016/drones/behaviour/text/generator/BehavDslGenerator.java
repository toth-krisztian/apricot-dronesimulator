/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.generator;

import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavDSL;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BehavDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _uRI = resource.getURI();
    String _string = _uRI.toString();
    final int length = _string.length();
    URI _uRI_1 = resource.getURI();
    String _string_1 = _uRI_1.toString();
    URI _uRI_2 = resource.getURI();
    String _fileExtension = _uRI_2.fileExtension();
    int _length = _fileExtension.length();
    int _minus = (length - _length);
    String _substring = _string_1.substring(0, _minus);
    String generatedURI = (_substring + "behaviour");
    final ResourceSet resourceSet = new ResourceSetImpl();
    URI _createURI = URI.createURI(generatedURI);
    final Resource xmiResource = resourceSet.createResource(_createURI);
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final BehavDSL root = ((BehavDSL) _get);
    EList<EObject> _contents_1 = xmiResource.getContents();
    DroneBehaviour _behav = root.getBehav();
    _contents_1.add(_behav);
    final XMIResource xmi = ((XMIResource) xmiResource);
    xmi.setEncoding("UTF-8");
    try {
      xmiResource.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
