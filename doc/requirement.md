# 需求文档

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;模块化微服务项目构建工具（Modular Microservices Project Builder），简称：MMPB。

## 项目概述

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;微服务架构下需要微服务应用的快速创建，好比我们看到的[start.spring.io](https://start.spring.io)，通过它能够快速的完后一个微服务应用的创建。但是它也存在一些问题，一个单工程的项目，我们为了后续的方便维护，需要的是一个多工程的项目，且有一定的分层概念，这时就需要一个工具进行帮助。

## 项目目标

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;目标主要有两个：

1. 一个工具，能够载入配置，生成项目的骨干结构；

2. 一个项目模块配置描述语法文件。

## 项目涉众

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;针对Java应用开发人员。

## 功能需求

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有一个项目模块描述的配置，可以是：yaml或者json，能够描述文件夹、文件、依赖或者默认固定配置等信息，通过这个描述配置，可以建模一个项目的物理视图。

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户根据要求编写配置，通过运行这个工具可以生成项目，提供一定的配置检查能力，如果出错会提示用户，如果是正常的，则在当前目录下生成项目的骨架。

## 风险分析

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开发阶段的帮助工具，无风险。

## 监控需求

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无。

## 附录

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无。
