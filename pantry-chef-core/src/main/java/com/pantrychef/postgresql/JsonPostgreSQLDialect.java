package com.pantrychef.postgresql;

import org.hibernate.dialect.PostgreSQL9Dialect;

public class JsonPostgreSQLDialect extends PostgreSQL9Dialect {

    public JsonPostgreSQLDialect() {

        super();

//		this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}
