/**
 * 
 */
package in.kempa.fcm.controller.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(CLASS)
@Target(TYPE)
/**
 * @author ganesh
 *
 */
public @interface FcmController {
	String entity();
}
