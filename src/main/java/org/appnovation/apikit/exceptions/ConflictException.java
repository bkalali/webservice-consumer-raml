
package org.appnovation.apikit.exceptions;

import org.mule.module.apikit.exception.MuleRestException;



public class ConflictException extends MuleRestException {

	private static final long serialVersionUID = 4655223886272060452L;

	public ConflictException(String message) {
        super(message);
    }
}