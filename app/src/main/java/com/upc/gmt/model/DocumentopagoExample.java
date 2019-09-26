package com.upc.gmt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DocumentopagoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentopagoExample() {
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

        public Criteria andNroSerieIsNull() {
            addCriterion("NroSerie is null");
            return (Criteria) this;
        }

        public Criteria andNroSerieIsNotNull() {
            addCriterion("NroSerie is not null");
            return (Criteria) this;
        }

        public Criteria andNroSerieEqualTo(String value) {
            addCriterion("NroSerie =", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieNotEqualTo(String value) {
            addCriterion("NroSerie <>", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieGreaterThan(String value) {
            addCriterion("NroSerie >", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieGreaterThanOrEqualTo(String value) {
            addCriterion("NroSerie >=", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieLessThan(String value) {
            addCriterion("NroSerie <", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieLessThanOrEqualTo(String value) {
            addCriterion("NroSerie <=", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieLike(String value) {
            addCriterion("NroSerie like", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieNotLike(String value) {
            addCriterion("NroSerie not like", value, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieIn(List<String> values) {
            addCriterion("NroSerie in", values, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieNotIn(List<String> values) {
            addCriterion("NroSerie not in", values, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieBetween(String value1, String value2) {
            addCriterion("NroSerie between", value1, value2, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andNroSerieNotBetween(String value1, String value2) {
            addCriterion("NroSerie not between", value1, value2, "nroSerie");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoIsNull() {
            addCriterion("CodDocumento is null");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoIsNotNull() {
            addCriterion("CodDocumento is not null");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoEqualTo(String value) {
            addCriterion("CodDocumento =", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoNotEqualTo(String value) {
            addCriterion("CodDocumento <>", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoGreaterThan(String value) {
            addCriterion("CodDocumento >", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("CodDocumento >=", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoLessThan(String value) {
            addCriterion("CodDocumento <", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoLessThanOrEqualTo(String value) {
            addCriterion("CodDocumento <=", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoLike(String value) {
            addCriterion("CodDocumento like", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoNotLike(String value) {
            addCriterion("CodDocumento not like", value, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoIn(List<String> values) {
            addCriterion("CodDocumento in", values, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoNotIn(List<String> values) {
            addCriterion("CodDocumento not in", values, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoBetween(String value1, String value2) {
            addCriterion("CodDocumento between", value1, value2, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andCodDocumentoNotBetween(String value1, String value2) {
            addCriterion("CodDocumento not between", value1, value2, "codDocumento");
            return (Criteria) this;
        }

        public Criteria andNroRucIsNull() {
            addCriterion("NroRuc is null");
            return (Criteria) this;
        }

        public Criteria andNroRucIsNotNull() {
            addCriterion("NroRuc is not null");
            return (Criteria) this;
        }

        public Criteria andNroRucEqualTo(String value) {
            addCriterion("NroRuc =", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucNotEqualTo(String value) {
            addCriterion("NroRuc <>", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucGreaterThan(String value) {
            addCriterion("NroRuc >", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucGreaterThanOrEqualTo(String value) {
            addCriterion("NroRuc >=", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucLessThan(String value) {
            addCriterion("NroRuc <", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucLessThanOrEqualTo(String value) {
            addCriterion("NroRuc <=", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucLike(String value) {
            addCriterion("NroRuc like", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucNotLike(String value) {
            addCriterion("NroRuc not like", value, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucIn(List<String> values) {
            addCriterion("NroRuc in", values, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucNotIn(List<String> values) {
            addCriterion("NroRuc not in", values, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucBetween(String value1, String value2) {
            addCriterion("NroRuc between", value1, value2, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andNroRucNotBetween(String value1, String value2) {
            addCriterion("NroRuc not between", value1, value2, "nroRuc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNull() {
            addCriterion("TipoDocumento is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNotNull() {
            addCriterion("TipoDocumento is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoEqualTo(String value) {
            addCriterion("TipoDocumento =", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotEqualTo(String value) {
            addCriterion("TipoDocumento <>", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThan(String value) {
            addCriterion("TipoDocumento >", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("TipoDocumento >=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThan(String value) {
            addCriterion("TipoDocumento <", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThanOrEqualTo(String value) {
            addCriterion("TipoDocumento <=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLike(String value) {
            addCriterion("TipoDocumento like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotLike(String value) {
            addCriterion("TipoDocumento not like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIn(List<String> values) {
            addCriterion("TipoDocumento in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotIn(List<String> values) {
            addCriterion("TipoDocumento not in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoBetween(String value1, String value2) {
            addCriterion("TipoDocumento between", value1, value2, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotBetween(String value1, String value2) {
            addCriterion("TipoDocumento not between", value1, value2, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNull() {
            addCriterion("FechaPago is null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNotNull() {
            addCriterion("FechaPago is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago =", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago <>", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaPago >", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago >=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThan(Date value) {
            addCriterionForJDBCDate("FechaPago <", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaPago <=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIn(List<Date> values) {
            addCriterionForJDBCDate("FechaPago in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaPago not in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaPago between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaPago not between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIsNull() {
            addCriterion("UsuarioGenero is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIsNotNull() {
            addCriterion("UsuarioGenero is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroEqualTo(String value) {
            addCriterion("UsuarioGenero =", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotEqualTo(String value) {
            addCriterion("UsuarioGenero <>", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroGreaterThan(String value) {
            addCriterion("UsuarioGenero >", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioGenero >=", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLessThan(String value) {
            addCriterion("UsuarioGenero <", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLessThanOrEqualTo(String value) {
            addCriterion("UsuarioGenero <=", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroLike(String value) {
            addCriterion("UsuarioGenero like", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotLike(String value) {
            addCriterion("UsuarioGenero not like", value, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroIn(List<String> values) {
            addCriterion("UsuarioGenero in", values, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotIn(List<String> values) {
            addCriterion("UsuarioGenero not in", values, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroBetween(String value1, String value2) {
            addCriterion("UsuarioGenero between", value1, value2, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andUsuarioGeneroNotBetween(String value1, String value2) {
            addCriterion("UsuarioGenero not between", value1, value2, "usuarioGenero");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionIsNull() {
            addCriterion("FehaGeneracion is null");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionIsNotNull() {
            addCriterion("FehaGeneracion is not null");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionEqualTo(Date value) {
            addCriterionForJDBCDate("FehaGeneracion =", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FehaGeneracion <>", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionGreaterThan(Date value) {
            addCriterionForJDBCDate("FehaGeneracion >", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FehaGeneracion >=", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionLessThan(Date value) {
            addCriterionForJDBCDate("FehaGeneracion <", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FehaGeneracion <=", value, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionIn(List<Date> values) {
            addCriterionForJDBCDate("FehaGeneracion in", values, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FehaGeneracion not in", values, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FehaGeneracion between", value1, value2, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andFehaGeneracionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FehaGeneracion not between", value1, value2, "fehaGeneracion");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIsNull() {
            addCriterion("UsuarioModifico is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIsNotNull() {
            addCriterion("UsuarioModifico is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoEqualTo(String value) {
            addCriterion("UsuarioModifico =", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotEqualTo(String value) {
            addCriterion("UsuarioModifico <>", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoGreaterThan(String value) {
            addCriterion("UsuarioModifico >", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoGreaterThanOrEqualTo(String value) {
            addCriterion("UsuarioModifico >=", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLessThan(String value) {
            addCriterion("UsuarioModifico <", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLessThanOrEqualTo(String value) {
            addCriterion("UsuarioModifico <=", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoLike(String value) {
            addCriterion("UsuarioModifico like", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotLike(String value) {
            addCriterion("UsuarioModifico not like", value, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoIn(List<String> values) {
            addCriterion("UsuarioModifico in", values, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotIn(List<String> values) {
            addCriterion("UsuarioModifico not in", values, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoBetween(String value1, String value2) {
            addCriterion("UsuarioModifico between", value1, value2, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andUsuarioModificoNotBetween(String value1, String value2) {
            addCriterion("UsuarioModifico not between", value1, value2, "usuarioModifico");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionIsNull() {
            addCriterion("FechaModificacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionIsNotNull() {
            addCriterion("FechaModificacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion =", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion <>", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("FechaModificacion >", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion >=", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionLessThan(Date value) {
            addCriterionForJDBCDate("FechaModificacion <", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FechaModificacion <=", value, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModificacion in", values, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("FechaModificacion not in", values, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModificacion between", value1, value2, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andFechaModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FechaModificacion not between", value1, value2, "fechaModificacion");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaIsNull() {
            addCriterion("Venta_idVenta is null");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaIsNotNull() {
            addCriterion("Venta_idVenta is not null");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaEqualTo(Integer value) {
            addCriterion("Venta_idVenta =", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaNotEqualTo(Integer value) {
            addCriterion("Venta_idVenta <>", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaGreaterThan(Integer value) {
            addCriterion("Venta_idVenta >", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaGreaterThanOrEqualTo(Integer value) {
            addCriterion("Venta_idVenta >=", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaLessThan(Integer value) {
            addCriterion("Venta_idVenta <", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaLessThanOrEqualTo(Integer value) {
            addCriterion("Venta_idVenta <=", value, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaIn(List<Integer> values) {
            addCriterion("Venta_idVenta in", values, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaNotIn(List<Integer> values) {
            addCriterion("Venta_idVenta not in", values, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaBetween(Integer value1, Integer value2) {
            addCriterion("Venta_idVenta between", value1, value2, "venta_idVenta");
            return (Criteria) this;
        }

        public Criteria andVenta_idVentaNotBetween(Integer value1, Integer value2) {
            addCriterion("Venta_idVenta not between", value1, value2, "venta_idVenta");
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