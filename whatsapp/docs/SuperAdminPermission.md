
# SuperAdminPermission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The super admin permission&#39;s UUID. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user who has super admin permissions. |  [optional]
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | The type of super admin permission. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the super admin permission was assigned. |  [optional]


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
VIEW | &quot;view&quot;
EDIT | &quot;edit&quot;
DELETE | &quot;delete&quot;
MANAGE | &quot;manage&quot;



