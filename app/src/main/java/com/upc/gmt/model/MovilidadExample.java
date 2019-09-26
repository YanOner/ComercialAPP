package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MovilidadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovilidadExample() {
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

        public Criteria andIdMovilidadIsNull() {
            addCriterion("IdMovilidad is null");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadIsNotNull() {
            addCriterion("IdMovilidad is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadEqualTo(Integer value) {
            addCriterion("IdMovilidad =", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotEqualTo(Integer value) {
            addCriterion("IdMovilidad <>", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadGreaterThan(Integer value) {
            addCriterion("IdMovilidad >", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdMovilidad >=", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadLessThan(Integer value) {
            addCriterion("IdMovilidad <", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadLessThanOrEqualTo(Integer value) {
            addCriterion("IdMovilidad <=", value, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadIn(List<Integer> values) {
            addCriterion("IdMovilidad in", values, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotIn(List<Integer> values) {
            addCriterion("IdMovilidad not in", values, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadBetween(Integer value1, Integer value2) {
            addCriterion("IdMovilidad between", value1, value2, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andIdMovilidadNotBetween(Integer value1, Integer value2) {
            addCriterion("IdMovilidad not between", value1, value2, "idMovilidad");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNull() {
            addCriterion("Placa is null");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNotNull() {
            addCriterion("Placa is not null");
            return (Criteria) this;
        }

        public Criteria andPlacaEqualTo(String value) {
            addCriterion("Placa =", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotEqualTo(String value) {
            addCriterion("Placa <>", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThan(String value) {
            addCriterion("Placa >", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThanOrEqualTo(String value) {
            addCriterion("Placa >=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThan(String value) {
            addCriterion("Placa <", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThanOrEqualTo(String value) {
            addCriterion("Placa <=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLike(String value) {
            addCriterion("Placa like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotLike(String value) {
            addCriterion("Placa not like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaIn(List<String> values) {
            addCriterion("Placa in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotIn(List<String> values) {
            addCriterion("Placa not in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaBetween(String value1, String value2) {
            addCriterion("Placa between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotBetween(String value1, String value2) {
            addCriterion("Placa not between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andMarcaIsNull() {
            addCriterion("Marca is null");
            return (Criteria) this;
        }

        public Criteria andMarcaIsNotNull() {
            addCriterion("Marca is not null");
            return (Criteria) this;
        }

        public Criteria andMarcaEqualTo(String value) {
            addCriterion("Marca =", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotEqualTo(String value) {
            addCriterion("Marca <>", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaGreaterThan(String value) {
            addCriterion("Marca >", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaGreaterThanOrEqualTo(String value) {
            addCriterion("Marca >=", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLessThan(String value) {
            addCriterion("Marca <", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLessThanOrEqualTo(String value) {
            addCriterion("Marca <=", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLike(String value) {
            addCriterion("Marca like", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotLike(String value) {
            addCriterion("Marca not like", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaIn(List<String> values) {
            addCriterion("Marca in", values, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotIn(List<String> values) {
            addCriterion("Marca not in", values, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaBetween(String value1, String value2) {
            addCriterion("Marca between", value1, value2, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotBetween(String value1, String value2) {
            addCriterion("Marca not between", value1, value2, "marca");
            return (Criteria) this;
        }

        public Criteria andModeloIsNull() {
            addCriterion("Modelo is null");
            return (Criteria) this;
        }

        public Criteria andModeloIsNotNull() {
            addCriterion("Modelo is not null");
            return (Criteria) this;
        }

        public Criteria andModeloEqualTo(String value) {
            addCriterion("Modelo =", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotEqualTo(String value) {
            addCriterion("Modelo <>", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloGreaterThan(String value) {
            addCriterion("Modelo >", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloGreaterThanOrEqualTo(String value) {
            addCriterion("Modelo >=", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLessThan(String value) {
            addCriterion("Modelo <", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLessThanOrEqualTo(String value) {
            addCriterion("Modelo <=", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLike(String value) {
            addCriterion("Modelo like", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotLike(String value) {
            addCriterion("Modelo not like", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloIn(List<String> values) {
            addCriterion("Modelo in", values, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotIn(List<String> values) {
            addCriterion("Modelo not in", values, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloBetween(String value1, String value2) {
            addCriterion("Modelo between", value1, value2, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotBetween(String value1, String value2) {
            addCriterion("Modelo not between", value1, value2, "modelo");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoIsNull() {
            addCriterion("CapacidadAlto is null");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoIsNotNull() {
            addCriterion("CapacidadAlto is not null");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoEqualTo(BigDecimal value) {
            addCriterion("CapacidadAlto =", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoNotEqualTo(BigDecimal value) {
            addCriterion("CapacidadAlto <>", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoGreaterThan(BigDecimal value) {
            addCriterion("CapacidadAlto >", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadAlto >=", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoLessThan(BigDecimal value) {
            addCriterion("CapacidadAlto <", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadAlto <=", value, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoIn(List<BigDecimal> values) {
            addCriterion("CapacidadAlto in", values, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoNotIn(List<BigDecimal> values) {
            addCriterion("CapacidadAlto not in", values, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadAlto between", value1, value2, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadAltoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadAlto not between", value1, value2, "capacidadAlto");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoIsNull() {
            addCriterion("CapacidadLargo is null");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoIsNotNull() {
            addCriterion("CapacidadLargo is not null");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoEqualTo(BigDecimal value) {
            addCriterion("CapacidadLargo =", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoNotEqualTo(BigDecimal value) {
            addCriterion("CapacidadLargo <>", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoGreaterThan(BigDecimal value) {
            addCriterion("CapacidadLargo >", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadLargo >=", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoLessThan(BigDecimal value) {
            addCriterion("CapacidadLargo <", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadLargo <=", value, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoIn(List<BigDecimal> values) {
            addCriterion("CapacidadLargo in", values, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoNotIn(List<BigDecimal> values) {
            addCriterion("CapacidadLargo not in", values, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadLargo between", value1, value2, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadLargoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadLargo not between", value1, value2, "capacidadLargo");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoIsNull() {
            addCriterion("CapacidadAncho is null");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoIsNotNull() {
            addCriterion("CapacidadAncho is not null");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoEqualTo(BigDecimal value) {
            addCriterion("CapacidadAncho =", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoNotEqualTo(BigDecimal value) {
            addCriterion("CapacidadAncho <>", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoGreaterThan(BigDecimal value) {
            addCriterion("CapacidadAncho >", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadAncho >=", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoLessThan(BigDecimal value) {
            addCriterion("CapacidadAncho <", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CapacidadAncho <=", value, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoIn(List<BigDecimal> values) {
            addCriterion("CapacidadAncho in", values, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoNotIn(List<BigDecimal> values) {
            addCriterion("CapacidadAncho not in", values, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadAncho between", value1, value2, "capacidadAncho");
            return (Criteria) this;
        }

        public Criteria andCapacidadAnchoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CapacidadAncho not between", value1, value2, "capacidadAncho");
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