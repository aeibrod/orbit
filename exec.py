#!/usr/bin/env python

import os, sys, subprocess


def get_platform():

	platforms = {
		'linux': 'linux',
		'linux1': 'linux',
		'linux2': 'linux',
		'darwin': 'macos',
		'win32': 'windows'
	}

	return platforms[sys.platform]


subprocess.call(['java', '-Djava.library.path=./bin/native/' + get_platform(), '-jar', './bin/orbit.jar']);