/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.selecttag;

import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author J2EE-33
 */
public class SelectTag extends TagSupport {

    private String name;
    private String label;
    private String value;
    private Collection items;

    
    @Override
    public void setPageContext(PageContext pageContext) {
        this.pageContext = pageContext;
    }
    
    
    
    @Override
    public int doStartTag() throws JspException {
        Iterator iterator = items.iterator();
        
        try {
            JspWriter out = pageContext.getOut();
            out.print("<select name=\"");
            out.print(name);
            out.print("\">");
            
            while (iterator.hasNext()) {
                Object o = iterator.next();
                PropertyDescriptor lablePD = new PropertyDescriptor(label, o.getClass());
                PropertyDescriptor valuePD = new PropertyDescriptor(value, o.getClass());
                out.print("<option value=\"");
                out.print(
                        valuePD.getReadMethod().invoke(o, new Object[]{}).toString());
                out.print("\">");
                
                out.print(
                        lablePD.getReadMethod().invoke(o, new Object[]{}).toString());
                out.print("</option>");
            }
            out.print("</select>");
        } 
        catch (Exception e) {
            throw new JspException(e.getMessage());
        }
        return SKIP_BODY;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    public Collection getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public PageContext getPageContext() {
        return pageContext;
    }

    public static int getEVAL_BODY_AGAIN() {
        return EVAL_BODY_AGAIN;
    }

    public static int getSKIP_BODY() {
        return SKIP_BODY;
    }

    public static int getEVAL_BODY_INCLUDE() {
        return EVAL_BODY_INCLUDE;
    }

    public static int getSKIP_PAGE() {
        return SKIP_PAGE;
    }

    public static int getEVAL_PAGE() {
        return EVAL_PAGE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setItems(Collection items) {
        this.items = items;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
}
