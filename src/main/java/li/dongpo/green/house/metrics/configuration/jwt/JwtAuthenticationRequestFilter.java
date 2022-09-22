package li.dongpo.green.house.metrics.configuration.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dongpo.li
 * @date 2022/1/14
 */
//@Component // 这个不能用直接的方式所以这个舒适不能打开
public class JwtAuthenticationRequestFilter extends OncePerRequestFilter {
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationRequestFilter.class);

    private static final AntPathMatcher ANT_PATH_MATCHER = new AntPathMatcher();

    private static final String AUTHORIZATION_TOKEN_PREFIX = "Bearer ";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        chain.doFilter(request, response);
    }
}
