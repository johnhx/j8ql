/*
 * Copyright: 2014 Jeremy Chone
 * License: Apache V2 http://www.apache.org/licenses/LICENSE-2.0
 */

package org.j8ql;

public interface ToJavaConverter<T> extends BaseConverter{

    public Object toJava(T dbObj, ConvertContext ctx);
}
