create database edu;
use edu;

-- �û���
create table t_user(
	uuid			varchar(36)			not null,	-- ����id
	clogin			varchar(36)			null,	-- ��¼��
	cpassword		varchar(36)			null,	-- ����
	cname			varchar(36)			null,	-- ����
	csex			varchar(2)			null,	-- �Ա�
	cidcard			varchar(18)			null,	-- ���֤
	cnativeplace	varchar(36)			null,	-- ����
	ceducation		varchar(36)			null,	-- ѧ��
	dbirthday		datetime			null,	-- ����
	dentry			datetime			null,	-- ��ְ����
	dmission		datetime			null,	-- ��ְ����
	cmobile			varchar(11)			null,	-- �ֻ���
	cfixedline		varchar(36)			null,	-- �̻�
	caddress		varchar(255)		null,	-- סַ
	cqq				varchar(36)			null,	-- QQ��
	cmsn			varchar(36)			null,	-- MSN��	
	cmemo			varchar(255)		null,		-- ��ע
	cstatus			varchar(1)			null,		-- ״̬��0:ͣ��	1:���ã�
	dcreate			datetime			not null,	-- ��������
	dupdate			datetime			not null	-- ��������
);
alter table t_user add constraint PK_T_USER primary key (uuid);

-- Ȩ�ޱ�
create table t_authority(
	uuid			varchar(36)			not null,	-- ����id
	ctype			varchar(36)			not null,	-- ����
	ccode			varchar(36)			not null,	-- ����
	cname			varchar(36)			not null,	-- ����
	cparent			varchar(36)			null,		-- �ϼ�ģ�����
	ilevel			int					not null	-- �ȼ�
);
alter table t_authority add constraint PK_T_AUTHORITY primary key(uuid);

-- Ȩ�����
create table t_authority_group(
	uuid			varchar(36)			not null,	-- ����id
	ccode			varchar(36)			not null,	-- ����
	cname			varchar(128)		not null	-- ����
);
alter table t_authority_group add constraint PK_T_AUTHORITY_GROUP primary key (uuid);

-- Ȩ�ޡ�Ȩ���������
create table t_authority_link(
	uuid				varchar(36)			not null,	-- ����id
	uauthorityid		varchar(36)			not null,	-- Ȩ��id��t_authority.uuid��
	uauthoritygroupid	varchar(36)			not null	-- Ȩ����id��t_authority_group.uuid��
);
alter table t_authority_link add constraint PK_T_AUTHORITY_LINK primary key (uuid);
alter table t_authority_link add constraint FK_T_AUTHORITY_LINK_TO_T_AUTHORITY foreign key (uauthorityid) references t_authority(uuid);
alter table t_authority_link add constraint FK_T_AUTHORITY_LINK_TO_T_AUTHORITY_GROUP foreign key (uauthoritygroupid) references t_authority_group(uuid);

-- �û�Ȩ�ޱ�
create table t_user_authority(
	uuid				varchar(36)			not null,	-- ����id
	uuserid				varchar(36)			 not null,	-- �û�id��t_user.uuid��
	uauthoritygroupid	varchar(36)			not null	-- Ȩ����id��t_authority_group��
);
alter table t_user_authority add constraint PK_T_USER_AUTHORITY primary key (uuid);
alter table t_user_authority add constraint FK_T_USER_AUTHORITY_TO_T_USER foreign key (uuserid) references t_user(uuid);
alter table t_user_authority add constraint FK_T_USER_AUTHORITY_TO_T_AUTHORITY_GROUP foreign key (uauthoritygroupid) references t_authority_group(uuid);

-- ������־��
create table t_operate_log(
	uuid				varchar(36)			not null,	-- ����id
	uuserid				varchar(36)			not null,	-- �û�id��t_user.uuid��
	doperate			datetime			not null,	-- ����ʱ��
	cip					varchar(15)			not null,	-- ip��ַ
	curl				varchar(128)		not null,	-- ����url
	ctype				varchar(36)			null,		-- ��������
 	cmemo				varchar(255)		not null	-- ��ע
);
alter table t_operate_log add constraint PK_T_OPERATE_LOG primary key (uuid);
alter table t_operate_log add constraint FK_T_OPERATE_LOG_TO_T_USER foreign key (uuserid) references t_user(uuid);


