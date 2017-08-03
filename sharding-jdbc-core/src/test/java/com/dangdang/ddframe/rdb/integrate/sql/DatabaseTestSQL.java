/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.integrate.sql;

public class DatabaseTestSQL {
    
    private static final String INSERT_WITH_ALL_PLACEHOLDERS_SQL = "INSERT INTO t_order (order_id, user_id, status) VALUES (?, ?, ?)";
    
    private static final String INSERT_WITH_PARTIAL_PLACEHOLDERS_SQL = "INSERT INTO t_order (order_id, user_id, status) VALUES (%s, %s, ?)";
    
    private static final String INSERT_WITHOUT_PLACEHOLDER_SQL = "INSERT INTO t_order (order_id, user_id, status) VALUES (%s, %s, 'insert')";
    
    private static final String UPDATE_WITHOUT_ALIAS_SQL = "UPDATE t_order SET status = %s WHERE order_id = %s AND user_id = %s";
    
    private static final String UPDATE_WITH_ALIAS_SQL = "UPDATE t_order AS o SET o.status = ? WHERE o.order_id = ? AND o.user_id = ?";
    
    private static final String DELETE_WITHOUT_ALIAS_SQL = "DELETE FROM t_order WHERE order_id = %s AND user_id = %s AND status = %s";
    
    private static final String ASSERT_SELECT_WITH_STATUS_SQL = "SELECT * FROM t_order WHERE status = %s";
    
    private static final String SELECT_EQUALS_WITH_SINGLE_TABLE_SQL = "SELECT * FROM t_order WHERE user_id = %s AND order_id = %s";
    
    private static final String SELECT_BETWEEN_WITH_SINGLE_TABLE_SQL = "SELECT * FROM t_order WHERE user_id BETWEEN %s AND %s AND order_id BETWEEN %s AND %s ORDER BY user_id, order_id";
    
    private static final String SELECT_IN_WITH_SINGLE_TABLE_SQL = "SELECT * FROM t_order WHERE user_id IN (%s, %s, %s) AND order_id IN (%s, %s) ORDER BY user_id, order_id";
    
    public String getInsertWithAllPlaceholdersSql() {
        return INSERT_WITH_ALL_PLACEHOLDERS_SQL;
    }
    
    public String getInsertWithPartialPlaceholdersSql() {
        return INSERT_WITH_PARTIAL_PLACEHOLDERS_SQL;
    }
    
    public String getInsertWithoutPlaceholderSql() {
        return INSERT_WITHOUT_PLACEHOLDER_SQL;
    }
    
    public String getUpdateWithoutAliasSql() {
        return UPDATE_WITHOUT_ALIAS_SQL;
    }
    
    public String getUpdateWithAliasSql() {
        return UPDATE_WITH_ALIAS_SQL;
    }
    
    public String getDeleteWithoutAliasSql() {
        return DELETE_WITHOUT_ALIAS_SQL;
    }
    
    public String getAssertSelectWithStatusSql() {
        return ASSERT_SELECT_WITH_STATUS_SQL;
    }
    
    public String getSelectEqualsWithSingleTableSql() {
        return SELECT_EQUALS_WITH_SINGLE_TABLE_SQL;
    }
    
    public String getSelectBetweenWithSingleTableSql() {
        return SELECT_BETWEEN_WITH_SINGLE_TABLE_SQL;
    }
    
    public String getSelectInWithSingleTableSql() {
        return SELECT_IN_WITH_SINGLE_TABLE_SQL;
    }
}
