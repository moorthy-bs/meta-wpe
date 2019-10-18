SUMMARY = "WPE Framework OpenCDMi module for playready"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1fe8768cbb5fd322f7d50656133549de"

require include/wpeframework-plugins.inc

DEPENDS += " playready"

SRC_URI = "git://git@github.com/WebPlatformForEmbedded/OCDM-Playready.git;protocol=https;branch=master"
SRCREV = "023a064e3e87de8a9934394fd835f57f37bbcb10"

SRC_URI += "file://0001-ocdm-playready-playready-3.3-support.patch"

FILES_${PN} = "${datadir}/WPEFramework/OCDM/*.drm"
