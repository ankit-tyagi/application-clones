
# GroupPermissions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The group permission&#39;s UUID. |  [optional]
**chatId** | [**UUID**](UUID.md) | The UUID of the group chat. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user with the group permissions. |  [optional]
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | The type of group permission. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the group permission was assigned. |  [optional]


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
VIEW | &quot;view&quot;
SEND_MESSAGES | &quot;send_messages&quot;
EDIT | &quot;edit&quot;
DELETE | &quot;delete&quot;
MANAGE | &quot;manage&quot;



