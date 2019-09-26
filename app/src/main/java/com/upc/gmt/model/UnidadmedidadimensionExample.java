package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class UnidadmedidadimensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnidadmedidadimensionExample() {
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

        public Criteria andIdUMDIsNull() {
            addCriterion("IdUMD is null");
            return (Criteria) this;
        }

        public Criteria andIdUMDIsNotNull() {
            addCriterion("IdUMD is not null");
            return (Criteria) this;
        }

        public Criteria andIdUMDEqualTo(Integer value) {
            addCriterion("IdUMD =", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotEqualTo(Integer value) {
            addCriterion("IdUMD <>", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDGreaterThan(Integer value) {
            addCriterion("IdUMD >", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdUMD >=", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDLessThan(Integer value) {
            addCriterion("IdUMD <", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDLessThanOrEqualTo(Integer value) {
            addCriterion("IdUMD <=", value, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDIn(List<Integer> values) {
            addCriterion("IdUMD in", values, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotIn(List<Integer> values) {
            addCriterion("IdUMD not in", values, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDBetween(Integer value1, Integer value2) {
            addCriterion("IdUMD between", value1, value2, "idUMD");
            return (Criteria) this;
        }

        public Criteria andIdUMDNotBetween(Integer value1, Integer value2) {
            addCriterion("IdUMD not between", value1, value2, "idUMD");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("Descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("Descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("Descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("Descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("Descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("Descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("Descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("Descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("Descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("Descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("Descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("Descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("Descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNull() {
            addCriterion("Codigo is null");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNotNull() {
            addCriterion("Codigo is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoEqualTo(String value) {
            addCriterion("Codigo =", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotEqualTo(String value) {
            addCriterion("Codigo <>", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThan(String value) {
            addCriterion("Codigo >", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("Codigo >=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThan(String value) {
            addCriterion("Codigo <", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThanOrEqualTo(String value) {
            addCriterion("Codigo <=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLike(String value) {
            addCriterion("Codigo like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotLike(String value) {
            addCriterion("Codigo not like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoIn(List<String> values) {
            addCriterion("Codigo in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotIn(List<String> values) {
            addCriterion("Codigo not in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoBetween(String value1, String value2) {
            addCriterion("Codigo between", value1, value2, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotBetween(String value1, String value2) {
            addCriterion("Codigo not between", value1, value2, "codigo");
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