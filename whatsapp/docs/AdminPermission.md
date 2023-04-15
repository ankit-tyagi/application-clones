
# AdminPermission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The admin permission&#39;s UUID. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user who has admin permissions. |  [optional]
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | The type of admin permission. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the admin permission was assigned. |  [optional]


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
VIEW | &quot;view&quot;
EDIT | &quot;edit&quot;
DELETE | &quot;delete&quot;
MANAGE | &quot;manage&quot;



