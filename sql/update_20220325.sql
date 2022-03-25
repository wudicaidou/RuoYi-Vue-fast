INSERT INTO `ry-vue`.`sys_dict_type`(`dict_id`, `dict_name`, `dict_type`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (101, '业务类型', 'biz_business_type', '0', 'admin', '2022-03-24 14:46:09', '', NULL, NULL);
INSERT INTO `ry-vue`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (110, 1, '工程建设', '1', 'biz_business_type', NULL, 'default', 'N', '0', 'admin', '2022-03-24 14:46:27', '', NULL, NULL);
INSERT INTO `ry-vue`.`sys_dict_data`(`dict_code`, `dict_sort`, `dict_label`, `dict_value`, `dict_type`, `css_class`, `list_class`, `is_default`, `status`, `create_by`, `create_time`, `update_by`, `update_time`, `remark`) VALUES (111, 2, '政府采购', '2', 'biz_business_type', NULL, 'default', 'N', '0', 'admin', '2022-03-24 14:46:37', '', NULL, NULL);


-- 菜单 SQL
insert into sys_menu (menu_id, menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values(2001, '屏蔽测试数据', '5', '1', 'blacklist', 'quality/blacklist/index', 1, 0, 'C', '0', '0', 'quality:blacklist:list', 'list', 'admin', sysdate(), '', null, '测试数据黑名单菜单');

-- 按钮父菜单ID
-- SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单查询', 2001, '1',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单新增', 2001, '2',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单修改', 2001, '3',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单删除', 2001, '4',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单导出', 2001, '5',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:export',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单导入', 2001, '6',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:import',       '#', 'admin', sysdate(), '', null, '');