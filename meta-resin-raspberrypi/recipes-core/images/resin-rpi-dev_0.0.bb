include resin-rpi.inc

IMAGE_FEATURES_append = "debug-tweaks \
                        "
IMAGE_INSTALL_append = "nano supervisor-init-resin-dev vpn-init-staging \
			"
IMAGE_FSTYPES_forcevariable = "resin-noobs-dev"