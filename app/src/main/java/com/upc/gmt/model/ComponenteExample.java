package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class ComponenteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponenteExample() {
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

        public Criteria andIdComponenteIsNull() {
            addCriterion("IdComponente is null");
            return (Criteria) this;
        }

        public Criteria andIdComponenteIsNotNull() {
            addCriterion("IdComponente is not null");
            return (Criteria) this;
        }

        public Criteria andIdComponenteEqualTo(Integer value) {
            addCriterion("IdComponente =", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteNotEqualTo(Integer value) {
            addCriterion("IdComponente <>", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteGreaterThan(Integer value) {
            addCriterion("IdComponente >", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdComponente >=", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteLessThan(Integer value) {
            addCriterion("IdComponente <", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteLessThanOrEqualTo(Integer value) {
            addCriterion("IdComponente <=", value, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteIn(List<Integer> values) {
            addCriterion("IdComponente in", values, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteNotIn(List<Integer> values) {
            addCriterion("IdComponente not in", values, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteBetween(Integer value1, Integer value2) {
            addCriterion("IdComponente between", value1, value2, "idComponente");
            return (Criteria) this;
        }

        public Criteria andIdComponenteNotBetween(Integer value1, Integer value2) {
            addCriterion("IdComponente not between", value1, value2, "idComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteIsNull() {
            addCriterion("DescComponente is null");
            return (Criteria) this;
        }

        public Criteria andDescComponenteIsNotNull() {
            addCriterion("DescComponente is not null");
            return (Criteria) this;
        }

        public Criteria andDescComponenteEqualTo(String value) {
            addCriterion("DescComponente =", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteNotEqualTo(String value) {
            addCriterion("DescComponente <>", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteGreaterThan(String value) {
            addCriterion("DescComponente >", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteGreaterThanOrEqualTo(String value) {
            addCriterion("DescComponente >=", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteLessThan(String value) {
            addCriterion("DescComponente <", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteLessThanOrEqualTo(String value) {
            addCriterion("DescComponente <=", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteLike(String value) {
            addCriterion("DescComponente like", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteNotLike(String value) {
            addCriterion("DescComponente not like", value, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteIn(List<String> values) {
            addCriterion("DescComponente in", values, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteNotIn(List<String> values) {
            addCriterion("DescComponente not in", values, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteBetween(String value1, String value2) {
            addCriterion("DescComponente between", value1, value2, "descComponente");
            return (Criteria) this;
        }

        public Criteria andDescComponenteNotBetween(String value1, String value2) {
            addCriterion("DescComponente not between", value1, value2, "descComponente");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("Estado is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("Estado is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(String value) {
            addCriterion("Estado =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(String value) {
            addCriterion("Estado <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(String value) {
            addCriterion("Estado >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("Estado >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(String value) {
            addCriterion("Estado <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(String value) {
            addCriterion("Estado <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLike(String value) {
            addCriterion("Estado like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotLike(String value) {
            addCriterion("Estado not like", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<String> values) {
            addCriterion("Estado in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<String> values) {
            addCriterion("Estado not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(String value1, String value2) {
            addCriterion("Estado between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(String value1, String value2) {
            addCriterion("Estado not between", value1, value2, "estado");
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