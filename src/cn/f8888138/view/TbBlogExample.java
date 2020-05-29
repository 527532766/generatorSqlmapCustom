package cn.f8888138.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBlogExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSunmmaryIsNull() {
            addCriterion("sunmmary is null");
            return (Criteria) this;
        }

        public Criteria andSunmmaryIsNotNull() {
            addCriterion("sunmmary is not null");
            return (Criteria) this;
        }

        public Criteria andSunmmaryEqualTo(String value) {
            addCriterion("sunmmary =", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryNotEqualTo(String value) {
            addCriterion("sunmmary <>", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryGreaterThan(String value) {
            addCriterion("sunmmary >", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryGreaterThanOrEqualTo(String value) {
            addCriterion("sunmmary >=", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryLessThan(String value) {
            addCriterion("sunmmary <", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryLessThanOrEqualTo(String value) {
            addCriterion("sunmmary <=", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryLike(String value) {
            addCriterion("sunmmary like", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryNotLike(String value) {
            addCriterion("sunmmary not like", value, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryIn(List<String> values) {
            addCriterion("sunmmary in", values, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryNotIn(List<String> values) {
            addCriterion("sunmmary not in", values, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryBetween(String value1, String value2) {
            addCriterion("sunmmary between", value1, value2, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andSunmmaryNotBetween(String value1, String value2) {
            addCriterion("sunmmary not between", value1, value2, "sunmmary");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("Creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("Creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("Creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("Creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("Creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("Creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("Creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("Creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("Creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("Creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("Creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andClickhitsIsNull() {
            addCriterion("ClickHits is null");
            return (Criteria) this;
        }

        public Criteria andClickhitsIsNotNull() {
            addCriterion("ClickHits is not null");
            return (Criteria) this;
        }

        public Criteria andClickhitsEqualTo(Integer value) {
            addCriterion("ClickHits =", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsNotEqualTo(Integer value) {
            addCriterion("ClickHits <>", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsGreaterThan(Integer value) {
            addCriterion("ClickHits >", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClickHits >=", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsLessThan(Integer value) {
            addCriterion("ClickHits <", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsLessThanOrEqualTo(Integer value) {
            addCriterion("ClickHits <=", value, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsIn(List<Integer> values) {
            addCriterion("ClickHits in", values, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsNotIn(List<Integer> values) {
            addCriterion("ClickHits not in", values, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsBetween(Integer value1, Integer value2) {
            addCriterion("ClickHits between", value1, value2, "clickhits");
            return (Criteria) this;
        }

        public Criteria andClickhitsNotBetween(Integer value1, Integer value2) {
            addCriterion("ClickHits not between", value1, value2, "clickhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsIsNull() {
            addCriterion("ReplyHits is null");
            return (Criteria) this;
        }

        public Criteria andReplyhitsIsNotNull() {
            addCriterion("ReplyHits is not null");
            return (Criteria) this;
        }

        public Criteria andReplyhitsEqualTo(Integer value) {
            addCriterion("ReplyHits =", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsNotEqualTo(Integer value) {
            addCriterion("ReplyHits <>", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsGreaterThan(Integer value) {
            addCriterion("ReplyHits >", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReplyHits >=", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsLessThan(Integer value) {
            addCriterion("ReplyHits <", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsLessThanOrEqualTo(Integer value) {
            addCriterion("ReplyHits <=", value, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsIn(List<Integer> values) {
            addCriterion("ReplyHits in", values, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsNotIn(List<Integer> values) {
            addCriterion("ReplyHits not in", values, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsBetween(Integer value1, Integer value2) {
            addCriterion("ReplyHits between", value1, value2, "replyhits");
            return (Criteria) this;
        }

        public Criteria andReplyhitsNotBetween(Integer value1, Integer value2) {
            addCriterion("ReplyHits not between", value1, value2, "replyhits");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("Keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("Keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("Keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("Keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("Keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("Keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("Keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("Keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("Keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("Keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("Keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("Keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("Keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("Keyword not between", value1, value2, "keyword");
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