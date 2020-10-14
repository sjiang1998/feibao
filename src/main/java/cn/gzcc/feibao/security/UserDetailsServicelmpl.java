package cn.gzcc.feibao.security;

import cn.gzcc.feibao.dao.UserJpa;
import cn.gzcc.feibao.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServicelmpl implements UserDetailsService {

    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private UserJpa userJpa;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String s1 = request.getParameter("inline-radios");
//        String n1=request.getParameter("username");
        HttpSession session = request.getSession();
        session.setAttribute("role", s1);
//        session.setAttribute("loginname",s1);
        List<User> users = userJpa.findUserByName(s);
        UserDetails user = null;
        if (users.size() == 0) {
            this.logger.debug("Query returned no results for user '" + s + "'");
            throw new UsernameNotFoundException("Username  not found");
        } else {
            List<GrantedAuthority> dbAuths = new ArrayList();
            user = new org.springframework.security.core.userdetails.User(s, users.get(0).getPassword(), dbAuths);
        }

        return user;
    }
}
