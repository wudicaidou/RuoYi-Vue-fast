-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('屏蔽测试数据', '5', '1', 'blacklist', 'quality/blacklist/index', 1, 0, 'C', '0', '0', 'quality:blacklist:list', '#', 'admin', sysdate(), '', null, '测试数据黑名单菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('测试数据黑名单导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'quality:blacklist:export',       '#', 'admin', sysdate(), '', null, '');