package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/include/layout.jsp");
    _jspx_dependants.add("/include/head.jsp");
    _jspx_dependants.add("/include/logo_profile.jsp");
    _jspx_dependants.add("/include/nav.jsp");
    _jspx_dependants.add("/include/messages.jsp");
    _jspx_dependants.add("/include/pageHead.jsp");
    _jspx_dependants.add("/include/content.jsp");
    _jspx_dependants.add("/include/../views/v_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/v_them_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/v_sua_loai_san_pham.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title></title>\n");
      out.write("<link rel=\"stylesheet\" href=\"public/css/reset.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"public/css/style.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"public/css/invalid.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"public/css/print.css\" type=\"text/css\" media=\"print\" />\t\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/phantrang.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/font-awesome.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/ace-ie.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/ace-part2.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"public/css/ace-rtl.min.css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/ace.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/ace-extra.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/ace-elements.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/jquery-1.7.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/jquery.datePicker.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/simpla.jquery.configuration.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/facebox.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/jquery.wysiwyg.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/kiemtra.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/cau_hinh.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/ckeditor/ckeditor.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"public/scripts/Chart.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>");
      out.write("\n");
      out.write("<div id=\"body-wrapper\">\n");
      out.write("<!-- Wrapper for the radial gradient background -->\n");
      out.write("<div id=\"sidebar\">\n");
      out.write("  <div id=\"sidebar-wrapper\" class=\"print\"> <!-- Sidebar with logo and menu --> \n");
      out.write("    ");
      out.write("\n");
      out.write("<a href=\"quantri.php\"><img id=\"logo\" src=\"public/images/alphatek.png\" alt=\"logo T3H\" /></a> \n");
      out.write("<!-- Sidebar Profile links -->\n");
      out.write("<div id=\"profile-links\"> Chào, <a href=\"#\" title=\"Edit your profile\">\n");
      out.write("<?php echo $_SESSION[\"fullname\"] ?>\n");
      out.write("</a><br />\n");
      out.write("  <br />\n");
      out.write("  <a href=\"#\" title=\"View the Site\">View the Site</a> | \n");
      out.write("  <a href=\"quantri.php?func=exit\" title=\"Sign Out\">Sign Out</a> </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("     var pgurl = window.location.href.substr(window.location.href.lastIndexOf(\"/\")+1);\n");
      out.write("\t var id=null;\n");
      out.write("\t if (pgurl==\"\") pgurl=\".\" ;\n");
      out.write("     $(\"#main-nav li a\").each(function(){\n");
      out.write("          if($(this).attr(\"href\") == pgurl || $(this).attr(\"href\") == '' )\n");
      out.write("\t\t  {\n");
      out.write("\t\t\tvar title = $(this).attr(\"title\");\n");
      out.write("\t\t\tid=document.getElementById(title);\n");
      out.write("\t\t\t$(this).addClass(\"current\");\n");
      out.write("\t\t\t$(id).addClass(\"current\");\t\n");
      out.write("\t\t  }\n");
      out.write("\t\t  \n");
      out.write("     })\n");
      out.write("\t\t\n");
      out.write("\t$(id).click();\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script> \n");
      out.write("<ul id=\"main-nav\">\n");
      out.write("  <!-- Accordion Menu -->\n");
      out.write("  \n");
      out.write("  <li> \n");
      out.write("  <a href=\"quantri.php\" class=\"nav-top-item no-submenu\"> \n");
      out.write("  <!-- Add the class \"no-submenu\" to menu items with no sub menu  -->\n");
      out.write("  Danh m?c \n");
      out.write("  </a> \n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("  <li>\n");
      out.write("  <a href=\"#\" class=\"nav-top-item\" id=\"tintuc\"> Product </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"san_pham.php\" title=\"tintuc\">List of products</a></li>\n");
      out.write("      <li><a href=\"them_san_pham.php\" title=\"tintuc\">Add a product</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li> \n");
      out.write("  <a href=\"#\" class=\"nav-top-item\" id=\"loaisp\"> Kind of products </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"read_lsp\" title=\"loaisp\">List kind of products </a></li>\n");
      out.write("      <li><a href=\"add_lsp\" title=\"loaisp\" >Add a kind of product</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li> <a href=\"#\" class=\"nav-top-item\" id=\"khachhang\"> Customer </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"khach_hang.php\" title=\"khachhang\">Customers</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li> <a href=\"#\" class=\"nav-top-item\" id=\"user\"> User </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"nguoi_dung.php\" title=\"user\">List of user</a></li>\n");
      out.write("      <li><a href=\"them_nguoi_dung.php\" title=\"user\">Add a user</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li> <a href=\"#\" class=\"nav-top-item\" id=\"kind\"> Kind of user </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"loai_nguoi_dung.php\" title=\"kind\">Kind of user</a></li>\n");
      out.write("      <li><a href=\"them_loai_nguoi_dung.php\" title=\"kind\">Kind of user</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("   <li> <a href=\"#\" class=\"nav-top-item\" id=\"bill\"> Receipts </a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"hoa_don.php\" title=\"bill\">List of Receipts</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("<!-- End #main-nav -->");
      out.write("\n");
      out.write("    ");
      out.write("<div id=\"messages\" style=\"display: none\"> <!-- Messages are shown when a link with these attributes are clicked: href=\"#messages\" rel=\"modal\"  -->\n");
      out.write("  \n");
      out.write("  <h3>3 Messages</h3>\n");
      out.write("  <p> <strong>17th May 2009</strong> by Admin<br />\n");
      out.write("    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue. <small><a href=\"#\" class=\"remove-link\" title=\"Remove message\">Remove</a></small> </p>\n");
      out.write("  <p> <strong>2nd May 2009</strong> by Jane Doe<br />\n");
      out.write("    Ut a est eget ligula molestie gravida. Curabitur massa. Donec eleifend, libero at sagittis mollis, tellus est malesuada tellus, at luctus turpis elit sit amet quam. Vivamus pretium ornare est. <small><a href=\"#\" class=\"remove-link\" title=\"Remove message\">Remove</a></small> </p>\n");
      out.write("  <p> <strong>25th April 2009</strong> by Admin<br />\n");
      out.write("    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue. <small><a href=\"#\" class=\"remove-link\" title=\"Remove message\">Remove</a></small> </p>\n");
      out.write("  <form action=\"#\" method=\"post\">\n");
      out.write("    <h4>New Message</h4>\n");
      out.write("    <fieldset>\n");
      out.write("      <textarea class=\"textarea\" name=\"textfield\" cols=\"79\" rows=\"5\"></textarea>\n");
      out.write("    </fieldset>\n");
      out.write("    <fieldset>\n");
      out.write("      <select name=\"dropdown\" class=\"small-input\">\n");
      out.write("        <option value=\"option1\">Send to...</option>\n");
      out.write("        <option value=\"option2\">Everyone</option>\n");
      out.write("        <option value=\"option3\">Admin</option>\n");
      out.write("        <option value=\"option4\">Jane Doe</option>\n");
      out.write("      </select>\n");
      out.write("      <input class=\"button\" type=\"submit\" value=\"Send\" />\n");
      out.write("    </fieldset>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("<!-- End #messages -->");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- End #sidebar -->\n");
      out.write("<div id=\"main-content\">\n");
      out.write("<!-- Main Content Section with everything -->\n");
      out.write("<!-- Page Head --> \n");
      out.write("<div class=\"print\">\n");
      out.write(" ");
      out.write("\n");
      out.write("<h2>Qu?n tr? Nhà Hàng</h2>\n");
      out.write("\t\t\t<p id=\"page-intro\">Ngày c?p nh?t: <?php echo date(\"d/m/Y\") ?> </p>\n");
      out.write("\t\t\t<ul class=\"shortcut-buttons-set\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"shortcut-button\" href=\"themtintuc.php\"><span>\n");
      out.write("\t\t\t\t\t<img src=\"public/images/icons/pencil_48.png\" alt=\"icon\" /><br />\n");
      out.write("\t\t\t\t\tThêm tin\n");
      out.write("\t\t\t\t</span></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"shortcut-button\" href=\"hoadon.php\"><span>\n");
      out.write("\t\t\t\t\t<img src=\"public/images/icons/paper_content_pencil_48.png\" alt=\"icon\" /><br />\n");
      out.write("\t\t\t\t\tHóa ??n\n");
      out.write("\t\t\t\t</span></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"shortcut-button\" href=\"#\"><span>\n");
      out.write("\t\t\t\t\t<img src=\"public/images/icons/image_add_48.png\" alt=\"icon\" /><br />\n");
      out.write("\t\t\t\t\tUpload an Image\n");
      out.write("\t\t\t\t</span></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"shortcut-button\" href=\"#\"><span>\n");
      out.write("\t\t\t\t\t<img src=\"public/images/icons/clock_48.png\" alt=\"icon\" /><br />\n");
      out.write("\t\t\t\t\tAdd an Event\n");
      out.write("\t\t\t\t</span></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"shortcut-button\" href=\"#messages\" rel=\"modal\"><span>\n");
      out.write("\t\t\t\t\t<img src=\"public/images/icons/comment_48.png\" alt=\"icon\" /><br />\n");
      out.write("\t\t\t\t\tOpen Modal\n");
      out.write("\t\t\t\t</span></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul><!-- End .shortcut-buttons-set -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      out.write("   \n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div> <!-- End .clear --> \n");
      out.write("<!-- End Page Head --> \n");
      out.write("<!-- Content --> \n");

    String view = "";
    view = (String) request.getAttribute("view");
    
    if(view =="views/v_loai_san_pham.jsp")
    {
        
    
        

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Loai san pham</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Loai san pham</h1>\n");
      out.write("        ");
ResultSet l = (ResultSet) request.getAttribute("sp");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-7\">\n");
      out.write("          <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("            <thead class=\"thin-border-bottom\">\n");
      out.write("              <tr>\n");
      out.write("                <th> Mã loại người dùng </th>\n");
      out.write("                <th> Tên loại người dùng</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("               ");
 while(l.next()){
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print( l.getInt("ma_loai"));
      out.write("</td>    \n");
      out.write("                <td>");
      out.print( l.getString("ten_loai"));
      out.write("</td>      \n");
      out.write("                <td> \n");
      out.write("                   <a class=\"red\" href=\"Delete_loai_san_pham?ma_loai=");
      out.print( l.getInt("ma_loai"));
      out.write("\" onclick=\"return confirm('Bạn có muốn xóa dòng này') \" >\n");
      out.write("                       <img src=\"public/images/icons/cross_circle.png\" /> \n");
      out.write("                   </a>\n");
      out.write("                   \n");
      out.write("                   <a href=\"update_form?ma_loai=");
      out.print( l.getInt("ma_loai"));
      out.write("\" title=\"Edit\" >\n");
      out.write("                    <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                   </a> \n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-7\">\n");
      out.write("                <button class=\"btn btn-primary\" onclick=\"window.location='add_lsp'\"> <i class=\"ace-icon glyphicon glyphicon-plus  align-top bigger-125\"></i> Thêm loại người dùng </button>\n");
      out.write("            <button class=\"btn\" type=\"button\" onClick=\"window.location='read_lsp'\"> <i class=\"ace-icon fa fa-undo bigger-110\"></i> Quay lại </button>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');

    }
    else if(view == "views/v_them_loai_san_pham.jsp")
    {

      out.write("\n");
      out.write("    ");
      out.write("<div class=\"content-box-header\">\n");
      out.write("  <h3><?php echo $tieude ?></h3>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- End .content-box-header -->\n");
      out.write("<div class=\"content-box-content\">\n");
      out.write("  <div class=\"tab-content default-tab\" id=\"tab1\">\n");
      out.write("    <!--`ma_tin_tuc`, `tieu_de`, `tom_tat`, `chi_tiet`, `hinh`, `tac_gia`, `ngay_dang`, `ngay_gui`, `so_luot_xem`-->\n");
      out.write("    <form method=\"post\" action=\"Add_loai_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label>Tên lo?i s?n ph?m</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_loai\" name=\"ten_loai\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("             <p>\n");
      out.write("            <label>mô t?</label>\n");
      out.write("            <textarea name=\"mo_ta\" cols=\"50\" rows=\"3\" class=\"text-input textarea wysiwyg \" id=\"medium-input\"></textarea>\n");
      out.write("        </p>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("      \n");
      out.write("          <p>\n");
      out.write("            <label>Mã lo?i cha</label>\n");
      out.write("\t\t\t<select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai_cha\">\n");
      out.write("              <option value=\"9\">Nam</option>\n");
      out.write("              <option value=\"15\">Nu</option>       \n");
      out.write("        \t</select>          \n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("       \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button\" type=\"submit\" value=\"Cap nhat\" name=\"btnCapnhat\" />\n");
      out.write("            <input class=\"button\" type=\"button\" value=\"Bo qua\" onclick=\"window.location='read_lsp'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("\t   \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write('\n');
      out.write('\n');

    }
    else if(view == "views/v_sua_loai_san_pham.jsp")
    {

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<div class=\"content-box-header\">\n");
      out.write("  <h3><?php echo $tieude ?></h3>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("</div>\n");
 ResultSet sp = (ResultSet)request.getAttribute("sp"); 
      out.write("\n");
      out.write("<!-- End .content-box-header -->\n");
      out.write("<div class=\"content-box-content\">\n");
      out.write("  <div class=\"tab-content default-tab\" id=\"tab1\">\n");
      out.write("    <!--`ma_tin_tuc`, `tieu_de`, `tom_tat`, `chi_tiet`, `hinh`, `tac_gia`, `ngay_dang`, `ngay_gui`, `so_luot_xem`-->\n");
      out.write("    ");
 sp.next(); 
      out.write("\n");
      out.write("    <form method=\"post\" action=\"Update_loai_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("            \n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" readonly=\"readonly\" id=\"ma_loai\" name=\"ma_loai\" value=\"");
      out.print( sp.getInt("ma_loai"));
      out.write("\" />\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label>Tên lo?i s?n ph?m</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_loai\" name=\"ten_loai\" value=\"");
      out.print( sp.getString("ten_loai"));
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("             <p>\n");
      out.write("            <label>mô t?</label>\n");
      out.write("            <textarea name=\"mo_ta\" cols=\"50\" rows=\"3\" class=\"text-input textarea wysiwyg\" id=\"medium-input\">");
      out.print( sp.getString("mo_ta"));
      out.write("</textarea>\n");
      out.write("        </p>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("      \n");
      out.write("          <p>\n");
      out.write("            <label>Mã lo?i cha</label>\n");
      out.write("               <select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai_cha\">\n");
      out.write("                   <option ");
 if(sp.getInt("ma_loai_cha")==9) out.print("selected"); 
      out.write(" value=\"9\">Nam</option>\n");
      out.write("                   <option ");
 if(sp.getInt("ma_loai_cha")==15) out.print("selected"); 
      out.write(" value=\"15\">Nu</option>       \n");
      out.write("              </select>          \n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("       \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button\" type=\"submit\" value=\"Cap nhat\" name=\"btnCapnhat\" />\n");
      out.write("            <input class=\"button\" type=\"button\" value=\"Bo qua\" onclick=\"window.location='read_lsp'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("\t   \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write('\n');

    }

      out.write('\n');
      out.write(" \n");
      out.write("<!-- end Content -->\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<!-- Start Notifications --> \n");
      out.write("<!-- End Notifications -->\n");
      out.write("<div class=\"print\"> \n");
      out.write("<div id=\"footer\">\n");
      out.write("\t\t\t\t<small> <!-- Remove this notice or replace it with whatever you want -->\n");
      out.write("\t\t\t\t\t\t&#169; Copyright 2016 Your Company | Powered by <a href=\"#\">Qu?n lý Nhà Hàng</a> | <a href=\"#\">Top</a>\n");
      out.write("\t\t\t\t</small>\n");
      out.write("\t\t\t</div><!-- End #footer -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> <!-- End #main-content -->\n");
      out.write("\t</div></body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
