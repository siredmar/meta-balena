# Base this image on rpi-hwup-image
include recipes-core/images/rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-dropbear splash package-management"
VIDEO_CAMERA = "1"
IMAGE_INSTALL_append = "linux-firmware-ralink wireless-tools parted lvm2 openssl dosfstools e2fsprogs connman connman-client btrfs-tools apt docker-arm"
IMAGE_FSTYPES_forcevariable = "resin-noobs"
