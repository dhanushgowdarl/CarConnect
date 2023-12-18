package dao;

import entity.Admin;

public interface IAdminService {

	Admin getAdminById(int adminId);

	Admin getAdminByUsername(String username);

	Admin registerAdmin(String adminData);

	Admin updateAdmin(String adminData);

	Admin deleteAdmin(int adminId);
}
