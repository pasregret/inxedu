/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-13 05:48:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.inxedu.admin.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.inxedu.os.common.constants.CommonConstants;

public final class sys_002drole_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


/**图片、CSS、js静态资源文件地址*/
	static String staticServer = CommonConstants.staticServer;
	/**上传服务用服务器地址，访问时用staticImage，数据库中不存储域名*/
	static String uploadServerUrl=CommonConstants.uploadImageServer;
	 /**页面显示图片的前缀路径*/
    static String staticImage=CommonConstants.staticImage;

	//内容编辑器上传图片路径
	static String keuploadSimpleUrl = uploadServerUrl+"/image/keupload?";
	//图片上传路径 
	static String uploadSimpleUrl = uploadServerUrl+"/image/gok4?";
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/base.jsp", Long.valueOf(1545630730000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /base.jsp(21,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /base.jsp(21,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(CommonConstants.contextPath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /base.jsp(22,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctximg");
      // /base.jsp(22,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(CommonConstants.staticServer);
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>角色列表</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/common/ztree/css/zTreeStyle.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/common/ztree/jquery.ztree.core-3.5.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/common/ztree/jquery.ztree.excheck-3.5.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/admin/system/sys-role.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar treedata='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${functionList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tinitFunction(treedata);\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--  添加角色 弹窗  -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#overlay {\r\n");
      out.write("\tbackground: #303030;\r\n");
      out.write("\topacity: 0.50;\r\n");
      out.write("\tfilter: Alpha(opacity =   50);\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addRole {\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tborder: 2px solid #FFFFFF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tcolor: #990000;\r\n");
      out.write("\tpadding-top: 20px;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 110;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tbackground: #e7e7e7;\r\n");
      out.write("\tleft: 35%;\r\n");
      out.write("\ttop: 20%;\r\n");
      out.write("\topacity: 0.85;\r\n");
      out.write("\tfilter: Alpha(opacity =   85);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#updateRoleName {\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tborder: 2px solid #FFFFFF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tcolor: #990000;\r\n");
      out.write("\tpadding-top: 20px;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 110;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tbackground: #e7e7e7;\r\n");
      out.write("\tleft: 35%;\r\n");
      out.write("\ttop: 20%;\r\n");
      out.write("\topacity: 0.85;\r\n");
      out.write("\tfilter: Alpha(opacity =   85);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<fieldset>\r\n");
      out.write("\t<legend>\r\n");
      out.write("\t\t<span>角色</span>\r\n");
      out.write("\t\t&gt;\r\n");
      out.write("\t\t<span>角色管理</span>\r\n");
      out.write("\t</legend>\r\n");
      out.write("\t<div class=\"mt20\">\r\n");
      out.write("\t\t<form action=\"\" method=\"post\" id=\"updateRoleFunctionForm\" onsubmit=\"return updateRole();\">\r\n");
      out.write("\t\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"commonTab01\">\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"roleId\" onchange=\"onchangeRole(this.value);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"0\">请选择角色</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td width=\"80%\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" value=\"\" name=\"selectedFunctionIds\" id=\"selectedFunctionIds\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"ztreedemo\" class=\"ztree\"></div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"修改角色名称\" onclick=\"editRole(2)\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"添加角色\" onclick=\"editRole(1)\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"保存\" onclick=\"saveRoleFunction()\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"删除选中角色\" onclick=\"delRole();\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\">(*红字为功能权限，其他为菜单权限)</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 添加角色 -->\r\n");
      out.write("\t<div id=\"addRole\" class=\"addRole\" style=\"display: none\">\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>新角色名称：</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"roleName\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"saveRole()\" id=\"save-btn\" value=\"确定\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"cancelSave();\" value=\"取消\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div id=\"overlay\" class=\"overlay\" style=\"display: none\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 添加角色 -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/inxedu/admin/system/sys-role-page.jsp(88,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/inxedu/admin/system/sys-role-page.jsp(88,8) '${roleList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roleList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/inxedu/admin/system/sys-role-page.jsp(88,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("roleList");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleList.roleId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleList.roleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}