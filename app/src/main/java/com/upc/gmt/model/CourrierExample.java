package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class CourrierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourrierExample() {
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

        public Criteria andIdCourrierIsNull() {
            addCriterion("idCourrier is null");
            return (Criteria) this;
        }

        public Criteria andIdCourrierIsNotNull() {
            addCriterion("idCourrier is not null");
            return (Criteria) this;
        }

        public Criteria andIdCourrierEqualTo(Integer value) {
            addCriterion("idCourrier =", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierNotEqualTo(Integer value) {
            addCriterion("idCourrier <>", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierGreaterThan(Integer value) {
            addCriterion("idCourrier >", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierGreaterThanOrEqualTo(Integer value) {
            addCriterion("idCourrier >=", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierLessThan(Integer value) {
            addCriterion("idCourrier <", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierLessThanOrEqualTo(Integer value) {
            addCriterion("idCourrier <=", value, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierIn(List<Integer> values) {
            addCriterion("idCourrier in", values, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierNotIn(List<Integer> values) {
            addCriterion("idCourrier not in", values, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierBetween(Integer value1, Integer value2) {
            addCriterion("idCourrier between", value1, value2, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andIdCourrierNotBetween(Integer value1, Integer value2) {
            addCriterion("idCourrier not between", value1, value2, "idCourrier");
            return (Criteria) this;
        }

        public Criteria andDescripionIsNull() {
            addCriterion("Descripion is null");
            return (Criteria) this;
        }

        public Criteria andDescripionIsNotNull() {
            addCriterion("Descripion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripionEqualTo(String value) {
            addCriterion("Descripion =", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotEqualTo(String value) {
            addCriterion("Descripion <>", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionGreaterThan(String value) {
            addCriterion("Descripion >", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripion >=", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLessThan(String value) {
            addCriterion("Descripion <", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLessThanOrEqualTo(String value) {
            addCriterion("Descripion <=", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionLike(String value) {
            addCriterion("Descripion like", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotLike(String value) {
            addCriterion("Descripion not like", value, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionIn(List<String> values) {
            addCriterion("Descripion in", values, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotIn(List<String> values) {
            addCriterion("Descripion not in", values, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionBetween(String value1, String value2) {
            addCriterion("Descripion between", value1, value2, "descripion");
            return (Criteria) this;
        }

        public Criteria andDescripionNotBetween(String value1, String value2) {
            addCriterion("Descripion not between", value1, value2, "descripion");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("Direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("Direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("Direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("Direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("Direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("Direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("Direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("Direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("Direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("Direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("Direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("Direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("Direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("Direccion not between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNull() {
            addCriterion("Observacion is null");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNotNull() {
            addCriterion("Observacion is not null");
            return (Criteria) this;
        }

        public Criteria andObservacionEqualTo(String value) {
            addCriterion("Observacion =", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotEqualTo(String value) {
            addCriterion("Observacion <>", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThan(String value) {
            addCriterion("Observacion >", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThanOrEqualTo(String value) {
            addCriterion("Observacion >=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThan(String value) {
            addCriterion("Observacion <", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThanOrEqualTo(String value) {
            addCriterion("Observacion <=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLike(String value) {
            addCriterion("Observacion like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotLike(String value) {
            addCriterion("Observacion not like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionIn(List<String> values) {
            addCriterion("Observacion in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotIn(List<String> values) {
            addCriterion("Observacion not in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionBetween(String value1, String value2) {
            addCriterion("Observacion between", value1, value2, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotBetween(String value1, String value2) {
            addCriterion("Observacion not between", value1, value2, "observacion");
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