package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.List;

public class DireccionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DireccionExample() {
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

        public Criteria andIdDireccionIsNull() {
            addCriterion("IdDireccion is null");
            return (Criteria) this;
        }

        public Criteria andIdDireccionIsNotNull() {
            addCriterion("IdDireccion is not null");
            return (Criteria) this;
        }

        public Criteria andIdDireccionEqualTo(Integer value) {
            addCriterion("IdDireccion =", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionNotEqualTo(Integer value) {
            addCriterion("IdDireccion <>", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionGreaterThan(Integer value) {
            addCriterion("IdDireccion >", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdDireccion >=", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionLessThan(Integer value) {
            addCriterion("IdDireccion <", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionLessThanOrEqualTo(Integer value) {
            addCriterion("IdDireccion <=", value, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionIn(List<Integer> values) {
            addCriterion("IdDireccion in", values, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionNotIn(List<Integer> values) {
            addCriterion("IdDireccion not in", values, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionBetween(Integer value1, Integer value2) {
            addCriterion("IdDireccion between", value1, value2, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdDireccionNotBetween(Integer value1, Integer value2) {
            addCriterion("IdDireccion not between", value1, value2, "idDireccion");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("IdCliente is null");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("IdCliente is not null");
            return (Criteria) this;
        }

        public Criteria andIdClienteEqualTo(Integer value) {
            addCriterion("IdCliente =", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotEqualTo(Integer value) {
            addCriterion("IdCliente <>", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThan(Integer value) {
            addCriterion("IdCliente >", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdCliente >=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThan(Integer value) {
            addCriterion("IdCliente <", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Integer value) {
            addCriterion("IdCliente <=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteIn(List<Integer> values) {
            addCriterion("IdCliente in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotIn(List<Integer> values) {
            addCriterion("IdCliente not in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteBetween(Integer value1, Integer value2) {
            addCriterion("IdCliente between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("IdCliente not between", value1, value2, "idCliente");
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

        public Criteria andReferenciaIsNull() {
            addCriterion("Referencia is null");
            return (Criteria) this;
        }

        public Criteria andReferenciaIsNotNull() {
            addCriterion("Referencia is not null");
            return (Criteria) this;
        }

        public Criteria andReferenciaEqualTo(String value) {
            addCriterion("Referencia =", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotEqualTo(String value) {
            addCriterion("Referencia <>", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaGreaterThan(String value) {
            addCriterion("Referencia >", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaGreaterThanOrEqualTo(String value) {
            addCriterion("Referencia >=", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLessThan(String value) {
            addCriterion("Referencia <", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLessThanOrEqualTo(String value) {
            addCriterion("Referencia <=", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLike(String value) {
            addCriterion("Referencia like", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotLike(String value) {
            addCriterion("Referencia not like", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaIn(List<String> values) {
            addCriterion("Referencia in", values, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotIn(List<String> values) {
            addCriterion("Referencia not in", values, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaBetween(String value1, String value2) {
            addCriterion("Referencia between", value1, value2, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotBetween(String value1, String value2) {
            addCriterion("Referencia not between", value1, value2, "referencia");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("Telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("Telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("Telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("Telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("Telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("Telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("Telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("Telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("Telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("Telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("Telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("Telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("Telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("Telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNull() {
            addCriterion("Distrito is null");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNotNull() {
            addCriterion("Distrito is not null");
            return (Criteria) this;
        }

        public Criteria andDistritoEqualTo(String value) {
            addCriterion("Distrito =", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotEqualTo(String value) {
            addCriterion("Distrito <>", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThan(String value) {
            addCriterion("Distrito >", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("Distrito >=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThan(String value) {
            addCriterion("Distrito <", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThanOrEqualTo(String value) {
            addCriterion("Distrito <=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLike(String value) {
            addCriterion("Distrito like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotLike(String value) {
            addCriterion("Distrito not like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoIn(List<String> values) {
            addCriterion("Distrito in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotIn(List<String> values) {
            addCriterion("Distrito not in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoBetween(String value1, String value2) {
            addCriterion("Distrito between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotBetween(String value1, String value2) {
            addCriterion("Distrito not between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNull() {
            addCriterion("Provincia is null");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNotNull() {
            addCriterion("Provincia is not null");
            return (Criteria) this;
        }

        public Criteria andProvinciaEqualTo(String value) {
            addCriterion("Provincia =", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotEqualTo(String value) {
            addCriterion("Provincia <>", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThan(String value) {
            addCriterion("Provincia >", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("Provincia >=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThan(String value) {
            addCriterion("Provincia <", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThanOrEqualTo(String value) {
            addCriterion("Provincia <=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLike(String value) {
            addCriterion("Provincia like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotLike(String value) {
            addCriterion("Provincia not like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaIn(List<String> values) {
            addCriterion("Provincia in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotIn(List<String> values) {
            addCriterion("Provincia not in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaBetween(String value1, String value2) {
            addCriterion("Provincia between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotBetween(String value1, String value2) {
            addCriterion("Provincia not between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNull() {
            addCriterion("Departamento is null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNotNull() {
            addCriterion("Departamento is not null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoEqualTo(String value) {
            addCriterion("Departamento =", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotEqualTo(String value) {
            addCriterion("Departamento <>", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThan(String value) {
            addCriterion("Departamento >", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("Departamento >=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThan(String value) {
            addCriterion("Departamento <", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("Departamento <=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLike(String value) {
            addCriterion("Departamento like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotLike(String value) {
            addCriterion("Departamento not like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIn(List<String> values) {
            addCriterion("Departamento in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotIn(List<String> values) {
            addCriterion("Departamento not in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoBetween(String value1, String value2) {
            addCriterion("Departamento between", value1, value2, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotBetween(String value1, String value2) {
            addCriterion("Departamento not between", value1, value2, "departamento");
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