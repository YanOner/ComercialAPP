package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdendespachoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdendespachoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdOrdenDespachoIsNull() {
            addCriterion("IdOrdenDespacho is null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoIsNotNull() {
            addCriterion("IdOrdenDespacho is not null");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho =", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho <>", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoGreaterThan(Integer value) {
            addCriterion("IdOrdenDespacho >", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho >=", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoLessThan(Integer value) {
            addCriterion("IdOrdenDespacho <", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoLessThanOrEqualTo(Integer value) {
            addCriterion("IdOrdenDespacho <=", value, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoIn(List<Integer> values) {
            addCriterion("IdOrdenDespacho in", values, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotIn(List<Integer> values) {
            addCriterion("IdOrdenDespacho not in", values, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenDespacho between", value1, value2, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andIdOrdenDespachoNotBetween(Integer value1, Integer value2) {
            addCriterion("IdOrdenDespacho not between", value1, value2, "idOrdenDespacho");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIsNull() {
            addCriterion("FechaMovilidad is null");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIsNotNull() {
            addCriterion("FechaMovilidad is not null");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad =", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <>", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaMovilidad >", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad >=", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadLessThan(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaMovilidad <=", value, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadIn(List<Date> values) {
            addCriterionForJDBCDate("FechaMovilidad in", values, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaMovilidad not in", values, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaMovilidad between", value1, value2, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andFechaMovilidadNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaMovilidad not between", value1, value2, "fechaMovilidad");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioIsNull() {
            addCriterion("UsuarioAtendio is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioIsNotNull() {
            addCriterion("UsuarioAtendio is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioEqualTo(String value) {
            addCriterion("UsuarioAtendio =", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioNotEqualTo(String value) {
            addCriterion("UsuarioAtendio <>", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioGreaterThan(String value) {
            addCriterion("UsuarioAtendio >", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioAtendio >=", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioLessThan(String value) {
            addCriterion("UsuarioAtendio <", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioLessThanOrEqualTo(String value) {
            addCriterion("UsuarioAtendio <=", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioLike(String value) {
            addCriterion("UsuarioAtendio like", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioNotLike(String value) {
            addCriterion("UsuarioAtendio not like", value, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioIn(List<String> values) {
            addCriterion("UsuarioAtendio in", values, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioNotIn(List<String> values) {
            addCriterion("UsuarioAtendio not in", values, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioBetween(String value1, String value2) {
            addCriterion("UsuarioAtendio between", value1, value2, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAtendioNotBetween(String value1, String value2) {
            addCriterion("UsuarioAtendio not between", value1, value2, "usuarioAtendio");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionIsNull() {
            addCriterion("FechaAtencion is null");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionIsNotNull() {
            addCriterion("FechaAtencion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAtencion =", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAtencion <>", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaAtencion >", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAtencion >=", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionLessThan(Date value) {
            addCriterionForJDBCDate("FechaAtencion <", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaAtencion <=", value, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaAtencion in", values, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaAtencion not in", values, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaAtencion between", value1, value2, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaAtencionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaAtencion not between", value1, value2, "fechaAtencion");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIsNull() {
            addCriterion("FechaProgramada is null");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIsNotNull() {
            addCriterion("FechaProgramada is not null");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada =", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada <>", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaProgramada >", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada >=", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaLessThan(Date value) {
            addCriterionForJDBCDate("FechaProgramada <", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaProgramada <=", value, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProgramada in", values, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaProgramada not in", values, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProgramada between", value1, value2, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaProgramadaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaProgramada not between", value1, value2, "fechaProgramada");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaIsNull() {
            addCriterion("FechaEntrega is null");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaIsNotNull() {
            addCriterion("FechaEntrega is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaEqualTo(Date value) {
            addCriterionForJDBCDate("FechaEntrega =", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaEntrega <>", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaEntrega >", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaEntrega >=", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaLessThan(Date value) {
            addCriterionForJDBCDate("FechaEntrega <", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaEntrega <=", value, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaIn(List<Date> values) {
            addCriterionForJDBCDate("FechaEntrega in", values, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaEntrega not in", values, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaEntrega between", value1, value2, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andFechaEntregaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaEntrega not between", value1, value2, "fechaEntrega");
            return (Criteria) this;
        }

        public Criteria andIdVentaIsNull() {
            addCriterion("IdVenta is null");
            return (Criteria) this;
        }

        public Criteria andIdVentaIsNotNull() {
            addCriterion("IdVenta is not null");
            return (Criteria) this;
        }

        public Criteria andIdVentaEqualTo(Integer value) {
            addCriterion("IdVenta =", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotEqualTo(Integer value) {
            addCriterion("IdVenta <>", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaGreaterThan(Integer value) {
            addCriterion("IdVenta >", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdVenta >=", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaLessThan(Integer value) {
            addCriterion("IdVenta <", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaLessThanOrEqualTo(Integer value) {
            addCriterion("IdVenta <=", value, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaIn(List<Integer> values) {
            addCriterion("IdVenta in", values, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotIn(List<Integer> values) {
            addCriterion("IdVenta not in", values, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaBetween(Integer value1, Integer value2) {
            addCriterion("IdVenta between", value1, value2, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIdVentaNotBetween(Integer value1, Integer value2) {
            addCriterion("IdVenta not between", value1, value2, "idVenta");
            return (Criteria) this;
        }

        public Criteria andIidCourrierIsNull() {
            addCriterion("IidCourrier is null");
            return (Criteria) this;
        }

        public Criteria andIidCourrierIsNotNull() {
            addCriterion("IidCourrier is not null");
            return (Criteria) this;
        }

        public Criteria andIidCourrierEqualTo(Integer value) {
            addCriterion("IidCourrier =", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierNotEqualTo(Integer value) {
            addCriterion("IidCourrier <>", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierGreaterThan(Integer value) {
            addCriterion("IidCourrier >", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierGreaterThanOrEqualTo(Integer value) {
            addCriterion("IidCourrier >=", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierLessThan(Integer value) {
            addCriterion("IidCourrier <", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierLessThanOrEqualTo(Integer value) {
            addCriterion("IidCourrier <=", value, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierIn(List<Integer> values) {
            addCriterion("IidCourrier in", values, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierNotIn(List<Integer> values) {
            addCriterion("IidCourrier not in", values, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierBetween(Integer value1, Integer value2) {
            addCriterion("IidCourrier between", value1, value2, "iidCourrier");
            return (Criteria) this;
        }

        public Criteria andIidCourrierNotBetween(Integer value1, Integer value2) {
            addCriterion("IidCourrier not between", value1, value2, "iidCourrier");
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