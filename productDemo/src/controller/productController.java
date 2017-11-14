package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.product;

import service.productService;

@Controller
public class productController {
	@Autowired
	productService ps;

	public productService getPs() {
		return ps;
	}

	public void setPs(productService ps) {
		this.ps = ps;
	}
	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue="1")int pageindex,HttpServletRequest request){
		if(pageindex<1){
			return "index.jsp";
		}else{
			int begin=(pageindex-1)*2;
			List<product> list = ps.getAll(begin,2);
			int count=ps.count();
			int countpage=count%2==0?count/2:count/2+1;
			
			
			request.getSession().setAttribute("pageindex", pageindex);
			request.getSession().setAttribute("list", list);
			return "index.jsp";
		}
	}
	
		@RequestMapping("/del")
		@ResponseBody//声明该方法返回的字符串不是路径跳转  而是一个单传的字符内容
		public String del(HttpServletRequest request){
			String id = request.getParameter("id");
			
			int num = ps.del(Integer.parseInt(id));
			
			if(num>0){
				return "true";
			}else{
				return "";
			}		
		}
		
		@RequestMapping("/add")
		public String add(HttpServletRequest request){
			String name = request.getParameter("name");
			String desc = request.getParameter("desc");
			String type = request.getParameter("type");
			int id = Integer.parseInt(type);
			product p = new product();
			p.setProductname(name);
			p.setDescs(desc);
			p.setCid(id);

			System.out.println("!!!");
			
			int num = ps.add(p);
			if(num>0){
				return "getAll";
			}else{
				return "";
			}
			
			
		}
}
