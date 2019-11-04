SUMMARY = "WPE Framework OpenCDMi module for playready"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1fe8768cbb5fd322f7d50656133549de"

inherit distro_features_check
REQUIRED_DISTRO_FEATURES = "playready"

require include/wpeframework-plugins.inc

DEPENDS += " playready"

SRC_URI = "git://git@github.com/moorthy-bs/OCDM-Playready.git;protocol=https;branch=linaro-pr3.3"
SRCREV = "ca20ef80415b2055b5a18de57b6a35a8a3ee7b89"

FILES_${PN} = "${datadir}/WPEFramework/OCDM/*.drm"
