create database edu;
use edu;

-- 用户表
create table t_user(
	uuid			varchar(36)			not null,	-- 主键id
	clogin			varchar(36)			null,	-- 登录名
	cpassword		varchar(36)			null,	-- 密码
	cname			varchar(36)			null,	-- 姓名
	csex			varchar(2)			null,	-- 性别
	cidcard			varchar(18)			null,	-- 身份证
	cnativeplace	varchar(36)			null,	-- 籍贯
	ceducation		varchar(36)			null,	-- 学历
	dbirthday		datetime			null,	-- 生日
	dentry			datetime			null,	-- 入职日期
	dmission		datetime			null,	-- 离职日期
	cmobile			varchar(11)			null,	-- 手机号
	cfixedline		varchar(36)			null,	-- 固话
	caddress		varchar(255)		null,	-- 住址
	cqq				varchar(36)			null,	-- QQ号
	cmsn			varchar(36)			null,	-- MSN号	
	cmemo			varchar(255)		null,		-- 备注
	cstatus			varchar(1)			null,		-- 状态（0:停用	1:启用）
	dcreate			datetime			not null,	-- 创建日期
	dupdate			datetime			not null	-- 更新日期
);
alter table t_user add constraint PK_T_USER primary key (uuid);

-- 权限表
create table t_authority(
	uuid			varchar(36)			not null,	-- 主键id
	ctype			varchar(36)			not null,	-- 类型
	ccode			varchar(36)			not null,	-- 代码
	cname			varchar(36)			not null,	-- 名称
	cparent			varchar(36)			null,		-- 上级模块代码
	ilevel			int					not null	-- 等级
);
alter table t_authority add constraint PK_T_AUTHORITY primary key(uuid);

-- 权限组表
create table t_authority_group(
	uuid			varchar(36)			not null,	-- 主键id
	ccode			varchar(36)			not null,	-- 代码
	cname			varchar(128)		not null	-- 名称
);
alter table t_authority_group add constraint PK_T_AUTHORITY_GROUP primary key (uuid);

-- 权限、权限组关联表
create table t_authority_link(
	uuid				varchar(36)			not null,	-- 主键id
	uauthorityid		varchar(36)			not null,	-- 权限id【t_authority.uuid】
	uauthoritygroupid	varchar(36)			not null	-- 权限组id【t_authority_group.uuid】
);
alter table t_authority_link add constraint PK_T_AUTHORITY_LINK primary key (uuid);
alter table t_authority_link add constraint FK_T_AUTHORITY_LINK_TO_T_AUTHORITY foreign key (uauthorityid) references t_authority(uuid);
alter table t_authority_link add constraint FK_T_AUTHORITY_LINK_TO_T_AUTHORITY_GROUP foreign key (uauthoritygroupid) references t_authority_group(uuid);

-- 用户权限表
create table t_user_authority(
	uuid				varchar(36)			not null,	-- 主键id
	uuserid				varchar(36)			 not null,	-- 用户id【t_user.uuid】
	uauthoritygroupid	varchar(36)			not null	-- 权限组id【t_authority_group】
);
alter table t_user_authority add constraint PK_T_USER_AUTHORITY primary key (uuid);
alter table t_user_authority add constraint FK_T_USER_AUTHORITY_TO_T_USER foreign key (uuserid) references t_user(uuid);
alter table t_user_authority add constraint FK_T_USER_AUTHORITY_TO_T_AUTHORITY_GROUP foreign key (uauthoritygroupid) references t_authority_group(uuid);

-- 操作日志表
create table t_operate_log(
	uuid				varchar(36)			not null,	-- 主键id
	uuserid				varchar(36)			not null,	-- 用户id【t_user.uuid】
	doperate			datetime			not null,	-- 操作时间
	cip					varchar(15)			not null,	-- ip地址
	curl				varchar(128)		not null,	-- 操作url
	ctype				varchar(36)			null,		-- 操作类型
 	cmemo				varchar(255)		not null	-- 备注
);
alter table t_operate_log add constraint PK_T_OPERATE_LOG primary key (uuid);
alter table t_operate_log add constraint FK_T_OPERATE_LOG_TO_T_USER foreign key (uuserid) references t_user(uuid);


