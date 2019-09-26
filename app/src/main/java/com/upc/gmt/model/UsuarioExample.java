package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsuarioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsuarioExample() {
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

        public Criteria andCodUsuarioIsNull() {
            addCriterion("CodUsuario is null");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioIsNotNull() {
            addCriterion("CodUsuario is not null");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioEqualTo(String value) {
            addCriterion("CodUsuario =", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotEqualTo(String value) {
            addCriterion("CodUsuario <>", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioGreaterThan(String value) {
            addCriterion("CodUsuario >", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("CodUsuario >=", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLessThan(String value) {
            addCriterion("CodUsuario <", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLessThanOrEqualTo(String value) {
            addCriterion("CodUsuario <=", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioLike(String value) {
            addCriterion("CodUsuario like", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotLike(String value) {
            addCriterion("CodUsuario not like", value, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioIn(List<String> values) {
            addCriterion("CodUsuario in", values, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotIn(List<String> values) {
            addCriterion("CodUsuario not in", values, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioBetween(String value1, String value2) {
            addCriterion("CodUsuario between", value1, value2, "codUsuario");
            return (Criteria) this;
        }

        public Criteria andCodUsuarioNotBetween(String value1, String value2) {
            addCriterion("CodUsuario not between", value1, value2, "codUsuario");
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

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIsNull() {
            addCriterion("FechaCreacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIsNotNull() {
            addCriterion("FechaCreacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion =", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion <>", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaCreacion >", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion >=", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionLessThan(Date value) {
            addCriterionForJDBCDate("FechaCreacion <", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaCreacion <=", value, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaCreacion in", values, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaCreacion not in", values, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaCreacion between", value1, value2, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andFechaCreacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaCreacion not between", value1, value2, "fechaCreacion");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoIsNull() {
            addCriterion("CorreoElectronico is null");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoIsNotNull() {
            addCriterion("CorreoElectronico is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoEqualTo(String value) {
            addCriterion("CorreoElectronico =", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoNotEqualTo(String value) {
            addCriterion("CorreoElectronico <>", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoGreaterThan(String value) {
            addCriterion("CorreoElectronico >", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoGreaterThanOrEqualTo(String value) {
            addCriterion("CorreoElectronico >=", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoLessThan(String value) {
            addCriterion("CorreoElectronico <", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoLessThanOrEqualTo(String value) {
            addCriterion("CorreoElectronico <=", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoLike(String value) {
            addCriterion("CorreoElectronico like", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoNotLike(String value) {
            addCriterion("CorreoElectronico not like", value, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoIn(List<String> values) {
            addCriterion("CorreoElectronico in", values, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoNotIn(List<String> values) {
            addCriterion("CorreoElectronico not in", values, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoBetween(String value1, String value2) {
            addCriterion("CorreoElectronico between", value1, value2, "correoElectronico");
            return (Criteria) this;
        }

        public Criteria andCorreoElectronicoNotBetween(String value1, String value2) {
            addCriterion("CorreoElectronico not between", value1, value2, "correoElectronico");
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

        public Criteria andIdTipoUsuarioIsNull() {
            addCriterion("IdTipoUsuario is null");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioIsNotNull() {
            addCriterion("IdTipoUsuario is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioEqualTo(Integer value) {
            addCriterion("IdTipoUsuario =", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioNotEqualTo(Integer value) {
            addCriterion("IdTipoUsuario <>", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioGreaterThan(Integer value) {
            addCriterion("IdTipoUsuario >", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdTipoUsuario >=", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioLessThan(Integer value) {
            addCriterion("IdTipoUsuario <", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("IdTipoUsuario <=", value, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioIn(List<Integer> values) {
            addCriterion("IdTipoUsuario in", values, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioNotIn(List<Integer> values) {
            addCriterion("IdTipoUsuario not in", values, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("IdTipoUsuario between", value1, value2, "idTipoUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTipoUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("IdTipoUsuario not between", value1, value2, "idTipoUsuario");
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