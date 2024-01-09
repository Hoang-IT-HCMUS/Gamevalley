package dev.Group08.GameValley.Service;

import org.springframework.stereotype.Service;

@Service
public class PermissionService {
    public enum Permission {
        ADMIN,
        PROFESSIONAL,
        NORMAL,
        GUEST
    }

    public Permission getPermission(String username) {
        if (username.toLowerCase().contains("admin")) return Permission.ADMIN;
        if (username.toLowerCase().contains("professional")) return Permission.PROFESSIONAL;
        if (username.toLowerCase().contains("NORMAL")) return Permission.NORMAL;
        return Permission.GUEST;
    }
}
