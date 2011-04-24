/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package company.validation;

import company.Employee;

/**
 * A sample validator interface for {@link company.Employee}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EmployeeValidator {
	boolean validate();

	boolean validateSalary(double value);
	boolean validateMentor(Employee value);
	boolean validateName(String value);
	boolean validateAddress(String value);
}
