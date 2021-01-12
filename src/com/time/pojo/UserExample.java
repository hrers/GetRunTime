package com.time.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andClasIsNull() {
            addCriterion("clas is null");
            return (Criteria) this;
        }

        public Criteria andClasIsNotNull() {
            addCriterion("clas is not null");
            return (Criteria) this;
        }

        public Criteria andClasEqualTo(String value) {
            addCriterion("clas =", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotEqualTo(String value) {
            addCriterion("clas <>", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasGreaterThan(String value) {
            addCriterion("clas >", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasGreaterThanOrEqualTo(String value) {
            addCriterion("clas >=", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasLessThan(String value) {
            addCriterion("clas <", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasLessThanOrEqualTo(String value) {
            addCriterion("clas <=", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasLike(String value) {
            addCriterion("clas like", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotLike(String value) {
            addCriterion("clas not like", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasIn(List<String> values) {
            addCriterion("clas in", values, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotIn(List<String> values) {
            addCriterion("clas not in", values, "clas");
            return (Criteria) this;
        }

        public Criteria andClasBetween(String value1, String value2) {
            addCriterion("clas between", value1, value2, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotBetween(String value1, String value2) {
            addCriterion("clas not between", value1, value2, "clas");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCuccessIsNull() {
            addCriterion("cuccess is null");
            return (Criteria) this;
        }

        public Criteria andCuccessIsNotNull() {
            addCriterion("cuccess is not null");
            return (Criteria) this;
        }

        public Criteria andCuccessEqualTo(Integer value) {
            addCriterion("cuccess =", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessNotEqualTo(Integer value) {
            addCriterion("cuccess <>", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessGreaterThan(Integer value) {
            addCriterion("cuccess >", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuccess >=", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessLessThan(Integer value) {
            addCriterion("cuccess <", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessLessThanOrEqualTo(Integer value) {
            addCriterion("cuccess <=", value, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessIn(List<Integer> values) {
            addCriterion("cuccess in", values, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessNotIn(List<Integer> values) {
            addCriterion("cuccess not in", values, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessBetween(Integer value1, Integer value2) {
            addCriterion("cuccess between", value1, value2, "cuccess");
            return (Criteria) this;
        }

        public Criteria andCuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("cuccess not between", value1, value2, "cuccess");
            return (Criteria) this;
        }

        public Criteria andTimedescIsNull() {
            addCriterion("timeDesc is null");
            return (Criteria) this;
        }

        public Criteria andTimedescIsNotNull() {
            addCriterion("timeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andTimedescEqualTo(String value) {
            addCriterion("timeDesc =", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescNotEqualTo(String value) {
            addCriterion("timeDesc <>", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescGreaterThan(String value) {
            addCriterion("timeDesc >", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescGreaterThanOrEqualTo(String value) {
            addCriterion("timeDesc >=", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescLessThan(String value) {
            addCriterion("timeDesc <", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescLessThanOrEqualTo(String value) {
            addCriterion("timeDesc <=", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescLike(String value) {
            addCriterion("timeDesc like", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescNotLike(String value) {
            addCriterion("timeDesc not like", value, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescIn(List<String> values) {
            addCriterion("timeDesc in", values, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescNotIn(List<String> values) {
            addCriterion("timeDesc not in", values, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescBetween(String value1, String value2) {
            addCriterion("timeDesc between", value1, value2, "timedesc");
            return (Criteria) this;
        }

        public Criteria andTimedescNotBetween(String value1, String value2) {
            addCriterion("timeDesc not between", value1, value2, "timedesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}