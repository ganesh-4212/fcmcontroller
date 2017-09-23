/**
 * 
 */
package in.kempa.fcm.controller.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(CLASS)
@Target(METHOD)
/**
 * @author ganesh
 *
 */
public @interface FcmAction {
	String action();
}
