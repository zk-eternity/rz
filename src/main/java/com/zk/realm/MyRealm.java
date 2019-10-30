package com.zk.realm;

import com.zk.pojo.User;
import com.zk.service.UserService;
import lombok.Setter;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


@Setter
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
//    @Autowired
//    private RoleService roleService;
//    @Autowired
//    private PermissionService permissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        String username = (String) principals.getPrimaryPrincipal();
//
//        Set<String> roles = roleService.queryAllRolenameByUsername(username);
//        Set<String> permissions = permissionService.queryAllPermissionByUsername(username);
//
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.setRoles(roles);
//        info.setStringPermissions(permissions);
//
//        return info;
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println(".....shiro权限验证.....");
        String username = (String) token.getPrincipal();

        User user = userService.queryUserByUsername(username);

        if (user == null) {
            return null;
        }

        return new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                this.getName());
    }
}
